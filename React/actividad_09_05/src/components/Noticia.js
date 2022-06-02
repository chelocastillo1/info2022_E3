import React, {Component} from 'react'

class Noticia extends Component
{
    const nota = {
        titulo: "React 2022",
        descripcion: "Informatorio Chaco",
    };

    const [titulo, descripcion, ] = nota;

    render(){
        return (
            <header className="header">
                <h1>{titulo}</h1>
            </header>
            );
    }
}

export default Noticia;