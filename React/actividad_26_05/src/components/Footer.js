import React, {Component} from 'react'
import { Container, Row, Col } from 'react-bootstrap'

class Footer extends Component
{
    render(){
        return (
            <Container>
                <Row className="h-100 pt-4">
                    <Col className="w-100 text-center">© Footer Copyright</Col>
                </Row>
            </Container>
            )
    }
}

export default Footer;