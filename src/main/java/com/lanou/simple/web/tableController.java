package com.lanou.simple.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class tableController {
    @RequestMapping("/table")
    public String table(Model model) {

        List<Map<String, Object>> data = new ArrayList<>();
        Map row = new HashMap();
        row.put("id", 1);
        row.put("name", "曹操");
        row.put("sex", "男");
        data.add(row);

        row = new HashMap();
        row.put("id", 2);
        row.put("name", "康熙");
        row.put("sex", "男");
        data.add(row);

        row = new HashMap();
        row.put("id", 3);
        row.put("name", "VIP武则天");
        row.put("sex", "女");
        data.add(row);

        row = new HashMap();
        row.put("id", 4);
        row.put("name", "赵云");
        row.put("sex", "男");
        data.add(row);

        row = new HashMap();
        row.put("id", 5);
        row.put("name", "蔡文姬");
        row.put("sex", "女");
        data.add(row);

        model.addAttribute("data", data);
        return "table";
    }

}
