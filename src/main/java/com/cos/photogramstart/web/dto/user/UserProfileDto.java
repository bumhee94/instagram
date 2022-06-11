package com.cos.photogramstart.web.dto.user;

import com.cos.photogramstart.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserProfileDto {

	private boolean pageOwnerState;
	private int imageCount;
	private User user;
	private boolean subscribeState;
	private int subscribeCount;
}
