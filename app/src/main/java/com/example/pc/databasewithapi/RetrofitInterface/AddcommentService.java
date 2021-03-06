package com.example.pc.databasewithapi.RetrofitInterface;

import com.example.pc.databasewithapi.Models.AddCommentModel;
import com.example.pc.databasewithapi.Models.ComplicatedModel.AllPostsComment;
import com.example.pc.databasewithapi.Models.PostModel;
import com.example.pc.databasewithapi.Utils.Constants;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AddcommentService {
    String BaseURL = "http://"+ Constants.IP+"/my_facebook/";
    @FormUrlEncoded
    @POST("add_comment.php")
    Call<AddCommentModel> posting(@Field("user_id") String userId
            , @Field("post_id") String postId
            , @Field("comment_text") String commentText
    );
}
