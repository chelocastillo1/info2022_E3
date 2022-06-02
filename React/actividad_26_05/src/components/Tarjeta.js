import React, {Component} from 'react'
import { Card, Button } from 'react-bootstrap';

class Tarjeta extends Component
{
    constructor(props){
        super(props);
        this.state = {title: props.title, text: props.text, img: props.img};
    }

    getTitle(){
        return this.state.title;
    }

    getText(){
        return this.state.text;
    }

    getImagePath(){
        return this.state.img;
    }

    render(){
        return (
            <Card className="h-100">
                <Card.Img variant="top" src="holder.js/100px180" style={{ maxHeight: 320 }} />
                <Card.Body>
                    <Card.Title>{this.getTitle()}</Card.Title>
                    <Card.Text>{this.getText()}</Card.Text>
                    <Button variant="primary">More info</Button>
                </Card.Body>
            </Card>
            );
    }
}
//<Card style={{ width: '18rem' }}>
export default Tarjeta;