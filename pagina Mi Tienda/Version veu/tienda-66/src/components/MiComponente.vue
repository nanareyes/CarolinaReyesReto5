<template>
    <div class="container">
        <h1>Bienvenido {{cliente.nombre}}</h1>
        <div class="container">
            <div class="row">
                <input type="text" v-model="cliente.nombre">
                <button type="button" @click="enviarCliente()">Enviar cliente</button>
            </div>
            <div>
                <input type="number" v-model="cantidad">
            </div>
            <div class="row">
                <h3 v-if="cantidad>0"> Número mayor a cero </h3>
                <p v-else-if="cantidad===0">Número igual a cero</p>
                <h2 v-else>Número negativo</h2>
                <br>
            </div>
            <div class="row">
                <!--Este es el v-show-->
                <h2 v-show="cantidad>0">Número positivo (V-show)</h2>
            </div>
        </div>
<!--    <div class="container">
            {{productos}}
        </div> "con esto puedo mostrar en pantalla el array de productos o de cualquier variable-->
        <div class="container" id="ropa">
            <div v-for="producto in productos" :key="producto.id">
                <h1>Producto: {{producto.nombre}} </h1>
                <h2>Precio: {{ producto.precio }} </h2>
                <button type="button" @click="mostrarPrecioAcumulado(producto.precio)">Agregar</button>
            </div>
        </div>
        <br>
        <br>
        <div class="container" id="comida">
            <div class="row">
                <div v-for="alimento in alimentos" :key="alimento.id" class="col-lg-3 col-md-6 col-sm-6 col-xs-12 estilo-tarjeta">
                    <img class="img-thumbnail" :src="getPictureComida(alimento.imagen)">
                    <h2>{{ alimento.nombre }} </h2>
                    <h3>{{ alimento.precio }} </h3>
                    <button type="button" @click="mostrarPrecioAcumulado(alimento.precio)">Agregar</button>
                </div>
            </div>
        </div>
        <div class="container">
            <h3> <b>PRECIO TOTAL = </b>{{ precioAcumulado }} </h3>
        </div>
    </div>
</template>

<script>
import axios from 'axios'
export default {
    data () {
        return {
            cliente: { nombre: 'Juan', apellido: 'Castañeda' },
            cantidad: 0,
            productos: [],
            alimentos: [
                {
                    id: 1,
                    nombre: 'Hamburguesa',
                    precio: 13000,
                    imagen: 'hamburguesa.jpg'
                },
                {
                    id: 2,
                    nombre: 'Pizza',
                    precio: 8000,
                    imagen: 'pizza.jpg'
                },
                {
                    id: 3,
                    nombre: 'Tamal',
                    precio: 5000,
                    imagen: 'tamal.png'
                }
            ],
            precioAcumulado: 0
        }
    },
    methods: {
        mostrarPrecioAcumulado (precioProducto) {
            // Ejemplo //
            let variable1 = 'mi_variable'
            const mi_constante = 5
            console.log(variable1)
            console.log(mi_constante)
            ////
            this.precioAcumulado = this.precioAcumulado + precioProducto
        },
        getPictureComida (nombre_archivo) {
            /* Función para cargar imágenes dinámicamente */
            var images = require.context('@/assets/comida/', false, /\.jpg$|\.png$/)
            return images('./' + nombre_archivo)
        },
        enviarCliente () {
            axios.post('https://reqbin.com/echo/post/json',
            {
                headers: {
                'Content-Type': 'application/json'
                }
            },
            {
                data: this.cliente
            })
            .then(response => {
                let status_peticion = response.status
                console.log(status_peticion)
                let mensaje = response.data
               // this.productos = response.data
                alert(mensaje)
            })
        }
    },
    created () {
        this.productos = [
                {
                    id: 1,
                    nombre: 'Camiseta',
                    precio: 25000
                },
                {
                    id: 2,
                    nombre: 'Vestido',
                    precio: 150000
                },
                {
                    id: 3,
                    nombre: 'Pantalón',
                    precio: 120000
                }
            ]
        console.log('Ejecuta created')
    },
    mounted () {
        console.log('Ejecuta mounted')
        // this.enviarCliente()
    },
    watch: {
        cantidad (newVal, oldVal) {
            console.log(oldVal)
            console.log(newVal)
            if (newVal === 5) {
                alert('Es cinco!')
            }
        }
    }
}
</script>
<style scoped>
    .estilo-tarjeta {
        padding: 5px;
        border: solid;
        border-radius: 15px;
        background-color: orange;
        margin: 10px;
    }
</style>