package com.capstone.moayo.entity.Model;

import com.google.gson.annotations.SerializedName;

public class CategoryPostModel {
    @SerializedName("co_dogamId")
    private int dogamId;
    @SerializedName("co_categoryId")
    private int categoryId;
    @SerializedName("co_postId")
    private int postId;

    public CategoryPostModel(int dogamId, int categoryId, int postId) {
        this.dogamId = dogamId;
        this.categoryId = categoryId;
        this.postId = postId;
    }

    public int getDogamId() {
        return dogamId;
    }

    public void setDogamId(int dogamId) {
        this.dogamId = dogamId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("{");
        buffer.append("\t").append("dogamId : ").append(dogamId).append("\n");
        buffer.append("\t").append("categoryId : ").append(categoryId).append("\n");
        buffer.append("\t").append("postId : ").append(postId).append("\n");
        buffer.append("}");
        return buffer.toString();
    }
}
