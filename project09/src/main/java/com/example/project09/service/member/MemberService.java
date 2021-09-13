package com.example.project09.service.member;

import com.example.project09.entity.member.Member;
import com.example.project09.payload.member.request.UpdateInformationRequest;
import com.example.project09.payload.member.request.UpdatePasswordRequest;
import com.example.project09.payload.member.response.MemberProfileResponse;

public interface MemberService {
    void updatePassword(UpdatePasswordRequest request, Member member);
    void updateInfo(UpdateInformationRequest request, Member member);
    MemberProfileResponse getMemberProfile(Integer id);
}
