let carrito = [];
let total= 0;

function agregarAlCarrito(nombre_producto, precio_producto) {
    // alert(nombre + ' ' + precio);
    let producto = {nombre: nombre_producto, precio: precio_producto};
    carrito.push(producto);
    console.log(carrito);
    total = total + precio_producto;
    total_carrito.innerText = '$' + total;
    Swal.fire(
        'Producto Agregado!',
        'Se ha añadido' + nombre_producto + ' al carrito de compras',
        'success'
    )
}