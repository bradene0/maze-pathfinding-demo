package com.example.maze;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MazeController {

  private final MazeService mazeService;

  public MazeController(MazeService mazeService) {
    this.mazeService = mazeService;
  }

  @GetMapping("/api/mazes")
  public List<Maze> getMazes() {
    return mazeService.getMazes();
  }
}
