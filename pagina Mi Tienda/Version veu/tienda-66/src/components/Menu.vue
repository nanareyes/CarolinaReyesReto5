<template>
    <div id="banner">
        <div class="container">
            <h1 class="titulos">Tienda 66</h1>
            <h3>Mi tienda de Ropa</h3>
        </div>
        <img src="@/assets/banner.jpg" style="width: 100%;height: auto;padding-top: 0px;padding-bottom: 2px;">
        <table id="navBar">
            <tr>
                <th><a><router-link to="/">Inicio</router-link></a></th>
                <th><a><router-link to="/productos">Productos</router-link></a></th>
                <th><a><router-link to="/clientes">Clientes</router-link></a></th>
                <th><a><router-link to="/carrito">Carrito</router-link></a></th>
            </tr>
        </table>
    </div>
    </template>

<script>
export default {
    name: 'menu'
}
</script>
<style scoped>
    .titulos {
        font-family: verdana;
        font-size: 60px;
    }
    #banner {
        background-color: #edecec;
    }
</style>