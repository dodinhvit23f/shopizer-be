package com.shopizer.domain.authentication.dto.request;

import com.shopizer.constant.ApplicationMessage;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChangePasswordRequest {
    @NotEmpty(message = ApplicationMessage.AuthenticationMessage.OLD_PASSWORD_NOT_EMPTY)
    String oldPassword;
    @NotEmpty(message = ApplicationMessage.AuthenticationMessage.NEW_PASSWORD_NOT_EMPTY)
    String newPassword;
}
