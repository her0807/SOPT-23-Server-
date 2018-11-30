package org.sopt.seminar2.api;

import org.sopt.seminar2.model.User;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;

@RestController

public class UserController {
    private final static List<User> userList = new LinkedList<>();


    @GetMapping("/users")
    public String getUserList(
            @RequestParam(value = "part", defaultValue = "없습니다") final String part,
            @RequestParam(value = "name", defaultValue = "없습니다") final String name) {
        if (name != null) {
            System.out.println(name);
            for (User i : userList) {
                if (i.getName().equals(name)) return i.toString();
            }
            return "없습니다.";
        }

        if (part != null) {
            System.out.println(part);
            for (User u : userList) {
                if (u.getPart().equals(part))
                    return u.toString();
            }
            return "없어요!";
        } else {
            if (userList.isEmpty()) return "리스트 비었음..";
            else {
                StringBuilder S = new StringBuilder();
                for (User u : userList) {
                    S.append(u.toString()).append("\n");
                }
                return S.toString();
            }
        }
    }

    @GetMapping("/users/{userIdx}")
    public String getUser(@PathVariable(value = "userIdx") final int userIdx) {
        for (User u : userList) {
            if (u.getUserIdx() == userIdx) return u.toString();
        }
        return "없어용...";
    }

    @PostMapping("/users")
    public String saveUser(@RequestBody final User user) {
        userList.add(user);
        return "성공적으로 사용자가 저장되었어요";
    }

    @PutMapping("/users/{user_idx}")
    public String updateUser(
            @PathVariable(value = "userIdx") final int userIdx,
            @RequestBody final User user) {
        for (User u : userList) {
            if (u.getUserIdx() == userIdx) {
                userList.remove(u);
                userList.add(user);
                return " 성공적으로 사용자가 수정되었어요";
            }
        }
        return "업데이트 실패했어요...";
    }

    @DeleteMapping("/users/{user_idx}")
    public String deleteUser(@PathVariable(value = "userIdx") final int userIdx) {
        for (User u : userList) {
            if (u.getUserIdx() == userIdx) {
                userList.remove(u);
                return "성공적으로 삭제 되었습니다.";
            }
        }
        return "삭제 실패 했어요";
    }

}



