import './App.css';
import ListOfEmployee from './component/ListOfEmployee';
import CreateEmp from './component/CreateEmp';
import UpdateEmployeeComponent from './component/update';

function App() {
  return (
    <div className="App">
      <h1> This is the first page</h1>
      <ListOfEmployee></ListOfEmployee>
      <CreateEmp/>
        <UpdateEmployeeComponent/>
    </div>
  );
}

export default App;
