import { Autor } from "./autor.model"
import { Categoria } from "./categoria.model"

export interface Libro{
    idLibro: number
    titulo: string
    editorial: string
    numeroPaginas: number
    edicion: string
    idioma: string
    fecha_de_publicacion: Date
    descripcion: string
    tipo_de_pasta: string
    isbn: string
    num_ejemplares: number
    portada: string
    presentacion: string
    precio: number
    categoria: Categoria
    autor: Autor

    [key: string]: any;
}