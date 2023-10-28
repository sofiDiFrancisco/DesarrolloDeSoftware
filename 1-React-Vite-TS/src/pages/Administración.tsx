import ProductTable from "../components/ProductTable/ProductTable"
//import * as React from 'react';
//import { Product } from "../types/Product";


const Administración = () => {
/*const Administración:React.FC = () => {
  //State
  const [products, setProducts] = React.useState <Product[]>([]);
  //Effects
  //Cuando no hay dependencias renderiza una sola vez
  React.useEffect(function fetchProducts() {
    (async function () {
  
    const response = await fetch('https://fakestoreapi.com/products');
    const data = await response.json();
    setProducts(data);
    })();
  },[setProducts]);*/

  //render
  return (
    <>
    <ProductTable/>
    </>
  );
}

export default Administración