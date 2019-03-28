package ua.tania.dto;

import com.sun.istack.internal.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.tania.entity.Address;
import ua.tania.entity.Role;
import ua.tania.entity.User;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Created by Tania Nebesna on 27.03.2019
 */
@Data
public class UserDto {
    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    @Email
    private String email;

    @NotNull
    private Address address;

    @NotNull
    private List<Role> roles;

    public static UserDto toUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setAddress(user.getAddress());
        userDto.setRoles(user.getRoles());

        return userDto;
    }

}
