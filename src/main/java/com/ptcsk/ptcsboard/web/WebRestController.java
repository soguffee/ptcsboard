package com.ptcsk.ptcsboard.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ptcsk.ptcsboard.domain.posts.PostsRepository;
import com.ptcsk.ptcsboard.dto.posts.PostsSaveRequestDto;
import com.ptcsk.ptcsboard.service.PostsService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class WebRestController {
	
	private PostsService postsService;
	
	@GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
	
	@PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }

}
