package com.example.EmailNotifyService.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class EmailRequest {
    @NotBlank
    private String to;
    @NotBlank
    private String subject;
    @NotBlank
    private String body;
    private boolean isHtml;
    public EmailRequest(@NotBlank String to, @NotBlank String subject, @NotBlank String body, boolean isHtml) {
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.isHtml = isHtml;
    }
    public EmailRequest() {
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public boolean isHtml() {
        return isHtml;
    }
    public void setHtml(boolean isHtml) {
        this.isHtml = isHtml;
    }
    @Override
    public String toString() {
        return "EmailRequest [to=" + to + ", subject=" + subject + ", body=" + body + ", isHtml=" + isHtml
                + ", getBody()=" + getBody() + ", getSubject()=" + getSubject() + ", getTo()=" + getTo()
                + ", hashCode()=" + hashCode() + ", isHtml()=" + isHtml() + ", getClass()=" + getClass()
                + ", toString()=" + super.toString() + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmailRequest other = (EmailRequest) obj;
        if (to == null) {
            if (other.to != null)
                return false;
        } else if (!to.equals(other.to))
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        } else if (!subject.equals(other.subject))
            return false;
        if (body == null) {
            if (other.body != null)
                return false;
        } else if (!body.equals(other.body))
            return false;
        if (isHtml != other.isHtml)
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        result = prime * result + ((body == null) ? 0 : body.hashCode());
        result = prime * result + (isHtml ? 1231 : 1237);
        return result;
    }
}
