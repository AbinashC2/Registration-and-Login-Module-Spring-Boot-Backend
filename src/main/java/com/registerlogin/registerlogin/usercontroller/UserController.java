package com.registerlogin.registerlogin.usercontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @PostMapping(path="/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }


}