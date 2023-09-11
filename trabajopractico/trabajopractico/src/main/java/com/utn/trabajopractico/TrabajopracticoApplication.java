package com.utn.trabajopractico;

import com.utn.trabajopractico.anexo.*;
import com.utn.trabajopractico.entidades.*;
import com.utn.trabajopractico.repositorios.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class TrabajopracticoApplication {
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	DetallePedidoRepository detallePedidoRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	FacturaRepository facturaRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	RubroRepository rubroRepository;
	@Autowired
	UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(TrabajopracticoApplication.class, args);
		System.out.println("Trabajo Práctico 1");
	}

	@Bean
	CommandLineRunner init (ClienteRepository clienteRepo, DetallePedidoRepository detallePedidoRepo, DomicilioRepository domicilioRepo, FacturaRepository facturaRepo, PedidoRepository pedidoRepo,ProductoRepository productoRepo, RubroRepository rubroRepo, UsuarioRepository usuariioRepo){
		return args -> {
			System.out.println("----------ESTOY FUNCIONANDO----------");

			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");


			Cliente cliente = Cliente.builder()
					.nombre("Sofía")
					.apellido("Di Francisco")
					.email("sofidif@live.com.ar")
					.telefono("2613021630")
					.build();
			Cliente cliente1 = Cliente.builder()
					.nombre("Margarita")
					.apellido("Lopez")
					.email("lm@gmail.com")
					.telefono("156405553")
					.build();
			Domicilio domicilio = Domicilio.builder()
					.calle("Rivas. L")
					.numero("174")
					.localidad("Gral. Gutierrez")
					.build();
			Domicilio domicilio1 = Domicilio.builder()
					.calle("Los Penitentes")
					.numero("251")
					.localidad("Maipu")
					.build();
			DetallePedido detallePedido = DetallePedido.builder()
					.cantidad(2)
					.subtotal(1800)
					.build();
			DetallePedido detallePedido1 = DetallePedido.builder()
					.cantidad(4)
					.subtotal(12800)
					.build();
			DetallePedido detallePedido2 = DetallePedido.builder()
					.cantidad(1)
					.subtotal(1200)
					.build();
			DetallePedido detallePedido3 = DetallePedido.builder()
					.cantidad(1)
					.subtotal(2500)
					.build();
			Factura factura = Factura.builder()
					.fecha(format.parse("07-11-2021"))
					.numero(48484848)
					.formapago(FormaPago.EFECTIVO)
					.descuento(10)
					.total(1620)
					.build();
			Factura factura1 = Factura.builder()
					.fecha(format.parse("09-09-2023"))
					.numero(84848484)
					.formapago(FormaPago.MERCADOPAGO)
					.descuento(0)
					.total(14000)
					.build();
			Pedido pedido = Pedido.builder()
					.fecha(format.parse("07-11-2021"))
					.total(1800)
					.estado(Estado.ENTREGADO)
					.tipoenvio(TipoEnvio.RETIRA)
					.build();
			Pedido pedido1 = Pedido.builder()
					.fecha(format.parse("09-09-2023"))
					.total(2500)
					.estado(Estado.ENTREGADO)
					.tipoenvio(TipoEnvio.DELIVERY)
					.build();
			Pedido pedido2 = Pedido.builder()
					.fecha(format.parse("11-09-2023"))
					.total(4300)
					.estado(Estado.INICIADO)
					.tipoenvio(TipoEnvio.RETIRA)
					.build();
			Producto producto = Producto.builder()
					.tipo(Tipo.INSUMO)
					.tiempoEstimadoCocina(15)
					.denominacion("Limonada de menta y jengibre")
					.precioVenta(900)
					.precioCompra(850)
					.stockActual(100)
					.stockMinimo(5)
					.unidadMedida("l")
					.receta("Exprimos 6 limones y mezclamos con sirope de azucar y jengibre. Decorar con menta")
					.build();
			Producto producto1 = Producto.builder()
					.tipo(Tipo.MANUFACTURADO)
					.tiempoEstimadoCocina(45)
					.denominacion("Pizza Capricciosa")
					.precioVenta(2500)
					.precioCompra(2000)
					.stockActual(100)
					.stockMinimo(5)
					.unidadMedida("kg")
					.receta("Sobre la pizzeta añadir mozzarella, tomate, aceitunas, alcachofa, champiñones y jamón; llevar a cocción")
					.build();
			Producto producto2 = Producto.builder()
					.tipo(Tipo.INSUMO)
					.tiempoEstimadoCocina(30)
					.denominacion("Licuado de frutos rojos")
					.precioVenta(1200)
					.precioCompra(500)
					.stockActual(50)
					.stockMinimo(5)
					.unidadMedida("l")
					.receta("Trituramos los ingredientes con leche hasta obtener una crema homogénea")
					.build();
			Producto producto3 = Producto.builder()
					.tipo(Tipo.MANUFACTURADO)
					.tiempoEstimadoCocina(30)
					.denominacion("Cheeseburguer")
					.precioVenta(3200)
					.precioCompra(2000)
					.stockActual(900)
					.stockMinimo(10)
					.unidadMedida("kg")
					.receta("Cocinar la patty y añadir queso cheddar, cebollitas y ketchup ahumado")
					.build();
			Rubro rubro = Rubro.builder()
					.denominacion("Bebida")
					.build();
			Rubro rubro1 = Rubro.builder()
					.denominacion("Hamburguesa")
					.build();
			Rubro rubro2 = Rubro.builder()
					.denominacion("Pizza")
					.build();
			Usuario usuario =Usuario.builder()
					.nombre("Lino Rodríguez")
					.password("dAZ5KjKw")
					.build();
			Usuario usuario1 =Usuario.builder()
					.nombre("Miguel Portella")
					.password("28K3EpZv")
					.build();


			cliente.agregarPedido(pedido1);
			cliente.agregarDomicilio(domicilio);
			cliente.agregarDomicilio(domicilio1);
			detallePedido.setProducto(producto);
			detallePedido1.setProducto(producto3);
			detallePedido2.setProducto(producto2);
			detallePedido3.setProducto(producto1);
			pedido.setFactura(factura);
			pedido1.setFactura(factura1);
			pedido.agregarDetallePedido(detallePedido);
			pedido1.agregarDetallePedido(detallePedido1);
			pedido1.agregarDetallePedido(detallePedido2);
			pedido2.agregarDetallePedido(detallePedido);
			pedido2.agregarDetallePedido(detallePedido3);
			rubro.agregarProducto(producto);
			rubro.agregarProducto(producto2);
			rubro1.agregarProducto(producto3);
			rubro2.agregarProducto(producto1);
			usuario.agregarPedido(pedido);
			usuario.agregarPedido(pedido2);

			clienteRepository.save(cliente);
			clienteRepository.save(cliente1);
			domicilioRepository.save(domicilio);
			domicilioRepository.save(domicilio1);
			detallePedidoRepository.save(detallePedido);
			detallePedidoRepository.save(detallePedido1);
			detallePedidoRepository.save(detallePedido2);
			detallePedidoRepository.save(detallePedido3);
			facturaRepository.save(factura);
			facturaRepository.save(factura1);
			pedidoRepository.save(pedido);
			pedidoRepository.save(pedido1);
			pedidoRepository.save(pedido2);
			productoRepository.save(producto);
			productoRepository.save(producto1);
			productoRepository.save(producto2);
			productoRepository.save(producto3);
			rubroRepository.save(rubro);
			rubroRepository.save(rubro1);
			rubroRepository.save(rubro2);
			usuarioRepository.save(usuario);
			usuarioRepository.save(usuario1);

			//Recuperar objeto cliente desde la base de datos
			Cliente clienteRecuperado = clienteRepository.findById(cliente.getId()).orElse(null);
			if (clienteRecuperado != null) {
				System.out.println("Nombre: " + clienteRecuperado.getNombre());
				System.out.println("Apellido: " + clienteRecuperado.getApellido());
				System.out.println("Email: " + clienteRecuperado.getEmail());
				System.out.println("Telefono: " + clienteRecuperado.getTelefono());
				clienteRecuperado.mostrarDomicilios();
				clienteRecuperado.mostrarPedidos();
			}
		};
	}
}