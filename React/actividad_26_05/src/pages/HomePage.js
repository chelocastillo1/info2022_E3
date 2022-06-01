import React, {Component} from 'react'
import { CardGroup, Container, Row, Col } from 'react-bootstrap';
import Tarjeta from '../components/Tarjeta';

class HomePage extends Component {
    courses = [ {key: 1, title: "Server side rendering with React and Redux", text: "Build React, Redux and React Router apps using Server Side Rendering (SSR), Isomorphic, universal JS techniques.", image: 'ssr.jpg'},
                {key: 2, title: "REACT - The complete guide", text: "Dive in and learn React from scratch! Learn ReactJS, Redux, React Routing, animations, Next.js basics and way more!", image: 'react.jpg'},
                {key: 3, title: "The complete React web developer course (with Redux)", text: "Learn how to build and launch React web applications using a React v16, Redux, Webpack, Reac Router v4, and more!", image: 'reactFull.jpg'}
             ]

    render(){
        return (
            <Container>
                <CardGroup>
                    <Row>
                    { this.courses.map(course => 
                            <Col sm>
                                <Tarjeta key={course.key} title={course.title} text={course.text} img={course.pathImg} />
                            </Col>
                        )
                    }
                    </Row>
                </CardGroup>
            </Container>
          );
    }
}
export default HomePage;