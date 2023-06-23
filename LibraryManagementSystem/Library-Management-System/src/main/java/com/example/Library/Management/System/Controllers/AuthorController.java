package com.example.Library.Management.System.Controllers;

import com.example.Library.Management.System.DTO.AuthorEntryDTO;
import com.example.Library.Management.System.DTO.AuthorResponseDTO;
import com.example.Library.Management.System.Service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("author")
@Api(tags = "Author")
public class AuthorController {

    @Autowired
    AuthorService authorService;


    @PostMapping("/add")
    public String addAuthor(@RequestBody AuthorEntryDTO authorEntryDTO){
        return authorService.addAuthor(authorEntryDTO);
    }

    @GetMapping("/get-author")
    public AuthorResponseDTO getAuthor(@RequestParam("authorId") Integer authorID){
        return authorService.getAuthor(authorID);
    }
}
