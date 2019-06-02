package com.spring.training.rest.resource.api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.
PathVariable;
import org.springframework.web.bind.annotation.
RequestBody;
import org.springframework.web.bind.annotation.
RequestHeader;
import org.springframework.web.bind.annotation.
RequestMapping;
import org.springframework.web.bind.annotation.
RequestMethod;
import org.springframework.web.bind.annotation.
RequestParam;
import org.springframework.web.bind.annotation.
RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.spring.training.rest.resource.models.Employee;
import java.util.List;
public interface EmployeeApi {
	
@RequestMapping(value = "/employees",
produces = { "application/json" },
consumes = { "application/json" },
method = RequestMethod.POST)
default ResponseEntity<Object> addEmployee
(@RequestBody Employee newEmployee)
{
// do some magic!
return new ResponseEntity<Object>(HttpStatus.OK);
}

@RequestMapping(value = "/employees/{ID}",
produces = { "application/json" },
consumes = { "application/json" },
method = RequestMethod.DELETE)
default ResponseEntity<Object> deleteEmployeeByID
(@PathVariable("ID") Long ID)
{
// do some magic!
return new ResponseEntity<Object>(HttpStatus.OK);
}

@RequestMapping(value = "/employees/{ID}",
produces = { "application/json" },
consumes = { "application/json" },
method = RequestMethod.GET)
default ResponseEntity<Object> getEmployeeByID
(@PathVariable("ID") Long ID)
{
// do some magic!
return new ResponseEntity<Object>(HttpStatus.OK);
}

@RequestMapping(value = "/employees",
produces = { "application/json" },
consumes = { "application/json" },
method = RequestMethod.GET)
default ResponseEntity<List<Employee>> getEmployees()
{
// do some magic!
return new ResponseEntity<List<Employee>>(HttpStatus.
OK);
}
@RequestMapping(value = "/employees/{ID}",
produces = { "application/json" },
consumes = { "application/json" },
method = RequestMethod.PUT)
default ResponseEntity<Object> updateEmployeebyID
(@PathVariable("ID") Long ID,@RequestBody Employee
updateEmployee)
{
// do some magic!
return new ResponseEntity<Object>(HttpStatus.OK);
}
}