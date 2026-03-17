package org.example.kotlingugudan.service

import org.junit.jupiter.api.Test
import io.github.oshai.kotlinlogging.KotlinLogging

class GugudanServiceTest {

    private var gugudanService = GugudanService()
    private var log = KotlinLogging.logger {  }

    @Test
    fun `3단계 테스트`() {

        var dan:Int=3
        val items:List<String> = gugudanService.gugudan(dan)

        for(item in items){
            log.info(item)
        }

        log.info("done gugudan")

    }
}