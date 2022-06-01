import React, {Component} from 'react'
import { Container, Row, Col } from 'react-bootstrap';

class AboutPage extends Component {

    constructor(props){
        super(props);
        this.state = {nombre: props.nombre, email: props.email, group: props.group};
    }

    getNombre(){
        return this.state.nombre;
    }

    getEmail(){
        return this.state.email;
    }

    getGrupo(){
        return this.state.group;
    }

    render(){
        return (
            <>
            <h1>About Me</h1>
                <Container fluid xs={2}>
                    <Row>
                        <Col xs={1}><b>Alumno:</b></Col>
                        <Col>{ this.getNombre() }</Col>
                    </Row>
                    <Row>
                        <Col xs={1}><b>E-mail:</b></Col>
                        <Col>{ this.getEmail() }</Col>
                    </Row>
                    <Row>
                        <Col xs={1}><b>Grupo:</b></Col>
                        <Col>{ this.getGrupo() }</Col>
                    </Row>
                </Container>
            </>
        );
    }
}

export default AboutPage;