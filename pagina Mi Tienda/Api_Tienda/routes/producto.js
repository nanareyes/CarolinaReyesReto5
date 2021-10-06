import express from 'express';
const router = express.Router();

// importar el modelo DB producto
import Producto from '../models/producto';


// Get para consultar todos los productos
router.get('/productos', async (req, res) => {
    try {
        const productoDB = await Producto.find();
        res.json(productoDB);
    }
    catch (error) {
        return res.status(400).json({
            mensaje: 'Ocurrio un error',
            error
        })
    }
});
/* 
// Consultar un producto específico de la tienda
router.get('/producto/:id', async (req, res) => {

    const _id = req.params.id;

    try {
        const productoDB = await Producto.findOne({ _id });
        res.json(productoDB);
    }
    catch (error) {
        return res.status(400).json({
            mensaje: 'Ocurrio un error',
            error
        })
    }
});


// Agregar un nuevo producto
router.post('/nuevo-producto', async (req, res) => {
    const body = req.body;

    try {
        const productoDB = await Producto.create(body);
        res.status(200).json(productoDB);
    }
    catch (error) {
        return res.status(500).json({
            mensaje: 'Ocurrio un error',
            error
        })
    }
});


// Delete eliminar una nota
router.delete('/producto/:id', async (req, res) => {
    const _id = req.params.id;

    try {
        const productoDB = await Producto.findByIdAndDelete({ _id });

        if (!productoDB) {
            return res.status(400).json({
                mensaje: 'No se encontró el id indicado',
                error
            })
        }
        res.json(productoDB);
    }

    catch (error) {
        return res.status(400).json({
            mensaje: 'Ocurrio un error',
            error
        })
    }
});

// Put actualizar una nota
router.put('/producto/:id', async (req, res) => {
    const _id = req.params.id;
    const body = req.body;
    try {
        const productoDB = await Nota.findByIdAndUpdate(
            _id, body, { new: true });
        res.json(productoDB);
    }
    catch (error) {
        return res.status(400).json({
            mensaje: 'Ocurrio un error', error
        })
    }
});


 */
// Exportamos la configuración de express app
module.exports = router;