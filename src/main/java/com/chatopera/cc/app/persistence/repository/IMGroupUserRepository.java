/*
 * Copyright (C) 2017 优客服-多渠道客服系统
 * Modifications copyright (C) 2018 Chatopera Inc, <https://www.chatopera.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.chatopera.cc.app.persistence.repository;

import java.util.List;

import com.chatopera.cc.app.model.IMGroupUser;
import com.chatopera.cc.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.chatopera.cc.app.model.IMGroup;

public abstract interface IMGroupUserRepository extends
		JpaRepository<IMGroupUser, String> {
	
	
	public abstract IMGroupUser findByIdAndOrgi(String id , String orgi);

	public List<IMGroupUser> findByImgroupAndOrgi(IMGroup imgroup , String orgi);
	
	public IMGroupUser findByImgroupAndUserAndOrgi(IMGroup imgroup , User user, String orgi);
	
	public List<IMGroupUser> findByUserAndOrgi(User user, String orgi);
	
}
