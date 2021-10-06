import mongoose from 'mongoose';
const Schema = mongoose.Schema;

const productoSchema = new Schema({

    nombre: {type: String, required: [true, 'Nombre obligatorio']},
    codigoBarras: String,
    precio: {type: Number, required: [true, 'Precio requerido']},
    imagen: String,
    descripcion: {type: String, default: 'Lorem'},
    usuarioId: String,
    // date:{type: Date, default: Date.now},
    // activo: {type: Boolean, default: true}

});


// Convertir a modelo
const Producto = mongoose.model('Producto', productoSchema);
export default Producto;