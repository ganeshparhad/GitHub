package com.spring.training.rest.resource.service.mapper;
import java.util.ArrayList;
import java.util.List;
import com.spring.training.rest.resource.models.Employee;
import com.spring.training.rest.resource.repository.EmployeeEntity;
public class EmployeeEntityDTOMapper
{
public static EmployeeEntity mapToEntity(Employee dto)
{
EmployeeEntity entity=new EmployeeEntity();
if(dto==null)
{
return null;
}
entity.setId(dto.getId());
entity.setFirstName(dto.getFirstName());
entity.setLastName(dto.getLastName());
return entity;
}
public static Employee mapToDTO(EmployeeEntity entity)
{
Employee dto=new Employee();
if(entity==null)
{
return dto;
}
dto.setId(entity.getId());
dto.setFirstName(entity.getFirstName());
dto.setLastName(entity.getLastName());
return dto;
}
public static List<Employee> mapDTOList
(List<EmployeeEntity> entityList)
{
List<Employee> dtoList=new ArrayList<>();
for(EmployeeEntity entity:entityList)
{
dtoList.add(mapToDTO(entity));
}
return dtoList;
}
}