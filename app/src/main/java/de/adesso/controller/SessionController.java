package de.adesso.controller;

import de.adesso.model.SendSessionID;
import de.adesso.model.SessionId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

@RestController
public class SessionController{
    @GetMapping("/id")
    @ResponseBody
    public SendSessionID sendSessionID(SessionId sessionId) {
        return new SendSessionID(HtmlUtils.htmlEscape(sessionId.getId()));
    }
}
