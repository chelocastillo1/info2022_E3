import React, {Component} from 'react'
import { Nav, Navbar, Container, } from 'react-bootstrap';
import {LinkContainer} from 'react-router-bootstrap';

class Header extends Component
{
    render(){
        return (
            <Navbar bg="dark" variant="dark">
                <Container>
                    <LinkContainer to="/">
                        <Navbar.Brand>HOME</Navbar.Brand>
                    </LinkContainer>
                    <Nav className="me-auto">
                        <LinkContainer to="/about">
                            <Nav.Link>Acerca de</Nav.Link>
                        </LinkContainer>
                    </Nav>
                </Container>
            </Navbar>
            );
    }
}

export default Header;