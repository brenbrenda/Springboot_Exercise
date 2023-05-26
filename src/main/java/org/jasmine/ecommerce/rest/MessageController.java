package org.jasmine.ecommerce.rest;

import org.jasmine.ecommerce.entity.Message;
import org.jasmine.ecommerce.dao.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping
    public String getMessages(//@RequestParam("merchantId") Integer merchantId,//测试用，后续要去除注释并使用，测试1
                              //@RequestParam("userId") Integer userId,//测试用，后续要去除注释并使用，测试2
                              Model model) {
        Integer merchantId = 1;//测试用，后续要删掉这行，测试1
        Integer userId = 1;//测试用，后续要删掉这行，测试2
        List<Message> messages = messageRepository.findAllByMerchantIdAndUserIdOrderBySentAtDesc(merchantId, userId);
        model.addAttribute("messages", messages);
        return "messages";
    }

    @PostMapping("/reply")
    public String replyToMessage(@ModelAttribute Message newMessage,
                                 @RequestParam("merchantId") Integer merchantId,
                                 @RequestParam("userId") Integer userId) {
        //Integer merchantId = 1;//测试用，后续要删掉这行，测试1
        //Integer userId = 1;//测试用，后续要删掉这行，测试2
        newMessage.setMerchantId(merchantId);
        newMessage.setUserId(userId);
        newMessage.setSender("merchant");
        newMessage.setSentAt(LocalDateTime.now());
        messageRepository.save(newMessage);
        return "redirect:/messages?merchantId=" + merchantId + "&userId=" + userId;
    }
}