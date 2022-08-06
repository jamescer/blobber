import './App.css';
import Blobs from './components/Blobs';
import Footer from './components/Footer';
import Header from './components/Header';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Header />
        <h2>Blobber!</h2>
        <Blobs />
        <Footer />
      </header>
    </div>
  );
}

export default App;
