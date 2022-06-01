import logo from './logo.svg';
import './App.css';
import {BrowserRouter, Routes, Route, Link} from 'react-router-dom'
import Layout from "./pages/Layout";
import Home from "./pages/Home";
import Blogs from "./pages/About";
import Contact from "./pages/Contact";
import NoPage from "./pages/NoPage";

function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element="{<Layout />}">
        <Route index element="{<Home />}" />
        <Route path="contact" element="{<Contact />}" />
        <Route path="about" element="{<About />}" />
        <Route path="*" element="{<NoPage />}" />
      </Route>
    </Routes>
  </BrowserRouter>
  );
}

export default App;
