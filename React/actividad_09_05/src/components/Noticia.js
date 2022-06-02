//import React from 'react'

function Noticia()
{
    const nota = {
        titulo: "React 2022",
        descripcion: "Informatorio Chaco",
    };

    const {titulo, descripcion, } = nota;

    return (
        <header className="header">
            <h1>{titulo}</h1>
        </header>
        )
}

export default Noticia;