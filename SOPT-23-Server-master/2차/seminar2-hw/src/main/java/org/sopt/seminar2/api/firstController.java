package org.sopt.seminar2.api;


import org.springframework.web.bind.annotation.*;

@RestController
public class firstController {

//    @GetMapping("")
//    public String sujin(){
//        return "난 수진이야";
//    }
//    @RequestMapping(method = RequestMethod.GET,value = "")
//    public String sujin(){
//        return "RequestMapping 연습 중인 수진이야";
//    }
//    @GetMapping("1")
//    public String sujin2(){
//        return "URL Mapping 연습 중인 수진이야";
//    }
//    @GetMapping("/get1")
//    public String sujin3(){
//        return "1";
//    }
//    @GetMapping("/name/{name}")
//    public String getName(@PathVariable final  String name){
//        return name;
//    }

    @GetMapping("/part")
    public String getPart(@RequestParam(value = "part",defaultValue = "")final String part){
        return part;
    }
    @GetMapping("/info")
    public String getPart2(
            @RequestParam(value = "name")final String name,
            @RequestParam(value = "type",defaultValue ="최고" )final String type){
        return "Spring 배우고 있는 귀요미 "+name + "입니당 ~~"+type+"에요 여러분 !!";
    }
    @GetMapping("/num")
    public int number(@RequestParam(value = "num") final int[] num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }


}
