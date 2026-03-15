package org.example.kotlingugudan.controller

import org.example.kotlingugudan.service.GugudanService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GugudanController (
    private val gugudanService: GugudanService
){

    @GetMapping("/gugudan/{dan}")
    fun gugudan(@PathVariable dan: Int) =
        gugudanService.gugudan(dan)
}