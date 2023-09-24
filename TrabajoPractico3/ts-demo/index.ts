type Rating = {
    rate: number;
    count: number;
};

type Product = {
        id: number;
        title: string;
        price: number;
        description: string;
        category: string;
        image: string;
        rating: Rating;
    };
    
    fetch('https://fakestoreapi.com/products')
    .then (res => res.json())
    .then ((products:Product[]) => {

        //Prepare table HTML
        let tableHTML: string = '<thead><tr><th>ID</th><th>TITLE</th><th>DESCRIPTION</th><th>PRICE</th></tr></thead><tbody>';
        
        //LOOP through all products to generate rows of the table
        products.forEach((p:Product) => {
            tableHTML += `<tr><td>${p.id}</td><td>${p.title}</td><td>${p.description}</td><td>${p.price}</td></tr>`;
        });

        //Close table body
        tableHTML += '</tbody>'; 
        
        //Grab table element to set its inner HTML
        document.querySelector('#tableElement')!.innerHTML = tableHTML; 
        
        //Hide spinner 
        const spinnerElement: HTMLElement = document.querySelector('#spinnerContainer')!; 
        spinnerElement.style.display = 'none'; 
});