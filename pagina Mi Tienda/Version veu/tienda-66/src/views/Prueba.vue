<template>
    <div class="container">
        <h1>Mi prueba de rutas</h1><br>
        <MiComponente/>
    </div>
</template>
<script>
import MiComponente from '@/components/MiComponente.vue'
export default {
    components: {
        MiComponente
    },
    created () {
        console.log('Holaaa')
    }
}
</script>