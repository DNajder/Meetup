package sdainalproject.meetup.mapper;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sdainalproject.meetup.dao.UserModel;
import sdainalproject.meetup.dto.UserRegisterDto;

@Component
public class UserRegisterToModelMapper implements Converter<UserRegisterDto, UserModel> {

    @Override
    public UserModel convert(UserRegisterDto userDto) {
        if (userDto == null){
            return null;
        }
        final UserModel userModel = new UserModel();
        userModel.setName(userDto.getName());
        userModel.setEmail(userDto.getEmail());
        userModel.setPasswordHash(userDto.getPassword());
        return userModel;
    }
}
