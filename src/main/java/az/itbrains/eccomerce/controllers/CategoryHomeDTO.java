package az.itbrains.eccomerce.controllers;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor ;
import lombok.experimental.FieldDefaults ;
 @Data
 @AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class CategoryHomeDTO {
     Long id;
}