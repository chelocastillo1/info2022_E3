import logo from '../logo.svg';
import '../App.css';
import '../css/extra.css';
import React, {Component} from 'react'

class HolaMundo extends Component {
    textos = {
    titulo: "React 2022", 
    autor: "Castillo, H. Marcelo"
    }

    render(){
        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo" />
                    <p className="titulo">
                    <b>{titulo}</b>
                    </p>
                    
                    <p className="autor">{autor}</p>
                </header>
            </div>
          );
    }
}

export default HolaMundo;
