import '../App.css';
import '../css/extra.css';
import React, {Component} from 'react'

class Eventos extends Component {
    constructor(props){
        super(props);

        this.state = {contador: 1, };

        this.onDecrement = this.onDecrement.bind(this);
        this.onIncrement = this.onIncrement.bind(this);
    }

    onDecrement(event){
        if(this.getContador() > 0)
            this.setContador(this.getContador() - 1);
    }

    onIncrement(event){
        this.setContador(this.getContador() + 1);
    }

    getContador(){
        return(
            this.state.contador
        )
    }

    setContador(valor){
        this.setState({ contador: valor });
    }

    render(){
        return(
            <div>
                <button onClick={this.onDecrement}> - </button>
                <h2>{this.getContador()}</h2>
                <button onClick={this.onIncrement}> + </button>
            </div>
        )
    }
}

export default Eventos;