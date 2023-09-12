import './App.css';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';

import ListOfEmployee from './component/ListOfEmployee';
import CreateEmp from './component/CreateEmp';
import ViewEmployeeComponent from './component/ViewEmployeeComponent';

function App() {
  return (
    <div>
        <Router>
              
                <div className="container">
                    <Routes> 
                          <Route path = "/"  element = {<ListOfEmployee/>}></Route>
                          <Route path = "/employees" element = {<ListOfEmployee/>}></Route>
                          <Route path = "/add-employee" element = {<CreateEmp/>}></Route>
                          <Route path = "/view-employee" element = {<ViewEmployeeComponent/>}></Route>
                          {/* <Route path = "/update-employee/:id" component = {UpdateEmployeeComponent}></Route> */}
                    </Routes>
                </div>
              
        </Router>
    </div>
    
  );
}

export default App;
