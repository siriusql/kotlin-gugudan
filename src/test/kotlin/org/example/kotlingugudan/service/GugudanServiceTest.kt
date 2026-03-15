package org.example.kotlingugudan.service

import org.junit.jupiter.api.Test

class GugudanServiceTest {

    private var gugudanService = GugudanService()

    @Test
    fun `3단계 테스트`() {
        val result = gugudanService.gugudan(3)

        for(i in result){
            println(i)
        }

    }
}