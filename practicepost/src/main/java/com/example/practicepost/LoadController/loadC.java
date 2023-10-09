package com.example.practicepost.LoadController;


import com.example.practicepost.bean.load;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class loadC {

   @PostMapping("load")
   public ResponseEntity<load> getapi(@RequestParam int sid) {
      load Load = new load(sid, "delhi", "jaipur", "chemicals", "canter", 1, 100, "null", 1, "29/10/23");


      return ResponseEntity.ok()
              .header("Response", "list of loads with this shipperId")
              .body(Load);


   }



   @PostMapping("load")

   public ResponseEntity<load> postapi(@RequestBody load Load) {
      System.out.println(Load.getShipperid());
      System.out.println(Load.getLoadingpoint());
      System.out.println(Load.getUnloadingpoint());
      System.out.println(Load.getProducttype());
      System.out.println((Load.getTrucktype()));
      System.out.println((Load.getNooftrucks()));
      System.out.println(Load.getWeight());
      System.out.println(Load.getCommnent());
      System.out.println(Load.getShipperid());
      System.out.println(Load.getDate());
      return ResponseEntity.ok()
              .header("Response", "list of loads with this shipperId")
              .body(Load);


   }
//   public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("id") int studentId){
//      System.out.println(student.getFirstName());
//      System.out.println(student.getLastName());
//      return ResponseEntity.ok(student);
@PutMapping("load")
   public  ResponseEntity<load> updateapi(@RequestBody load Load, @PathVariable int shipperid) {
      System.out.println(Load.getShipperid());
      System.out.println(Load.getLoadingpoint());
      System.out.println(Load.getUnloadingpoint());
      System.out.println(Load.getProducttype());
      System.out.println((Load.getTrucktype()));
      System.out.println((Load.getNooftrucks()));
      System.out.println(Load.getWeight());
      System.out.println(Load.getCommnent());
      System.out.println(Load.getShipperid());
      System.out.println(Load.getDate());
      return ResponseEntity.ok(Load);
   }
//   public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId){
//      System.out.println(studentId);
//      return ResponseEntity.ok("Student deleted successfully!");
   public ResponseEntity<String> deleteapi(@PathVariable int shipperid){
      System.out.println(shipperid);
      return ResponseEntity.ok("Api with this id deleted successfully!");

   }



}
