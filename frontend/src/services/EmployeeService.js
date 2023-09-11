import axios from 'axios';

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/api/employees/";

class EmployeeService {

    getEmployees(){
        return axios.get(EMPLOYEE_API_BASE_URL+'getAll');
    }
    createEmployee(employee)
    {
        return axios.post('http://localhost:8080/api/employees/save',employee)
    }
    deleteEmployee(employeeId){
        return axios.delete(EMPLOYEE_API_BASE_URL + 'emp/' + employeeId);
    }
    updateEmployee(employee, employeeId){
        return axios.put(EMPLOYEE_API_BASE_URL + 'emp/' + employeeId, employee);
    }
}

const employeeService = new EmployeeService(); // Create an instance of the class

export default employeeService; 