import {BrowserRouter, Routes, Route, } from 'react-router-dom';

import Header from "./components/Header";
import Footer from "./components/Footer";
import HomePage from "./pages/HomePage";
import AboutPage from "./pages/AboutPage";

function App() {
  return (
      <BrowserRouter>
        <Header />
        <Routes>
          <Route index path="/" element={ <HomePage /> } />
          <Route path="/about" element={ <AboutPage nombre="Castillo, H. Marcelo" email="chelocastillo1@hotmail.com" group="1" /> } />
        </Routes>
        <Footer />
      </BrowserRouter>
  );
}

export default App;