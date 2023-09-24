fetch('https://fakestoreapi.com/products')
    .then(function (res) { return res.json(); })
    .then(function (products) {
        //Prepare table HTML
        var tableHTML = '<thead><tr><th>ID</th><th>TITLE</th><th>DESCRIPTION</th><th>PRICE</th></tr></thead><tbody>';
        //LOOP through all products to generate rows of the table
        products.forEach(function (p) {
            tableHTML += "<tr><td>".concat (p.id, "</td><td>").concat(p.title, "</td><td>").concat(p.description, "</td><td>").concat(p.price, "</td><td>");
        });
        //Close table body
        tableHTML += '</tbody>';
        //Grab table element to set its inner HTML
        document.querySelector('#tableElement').innerHTML = tableHTML; 
        //Hide spinner 
        var spinnerElement = document.querySelector('#spinnerContainer'); 
        spinnerElement.style.display = 'none'; 
    });