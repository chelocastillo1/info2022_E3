import React, {Component} from 'react'
import { Container, Row, Col } from 'react-bootstrap'

class Footer extends Component
{
    render(){
        return (
            <Container fluid>
                <Row>
                    <Col>© Footer Copyright</Col>
                </Row>
            </Container>
            )
    }
}

export default Footer;