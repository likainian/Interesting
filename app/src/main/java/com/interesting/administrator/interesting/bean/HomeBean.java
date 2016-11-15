package com.interesting.administrator.interesting.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 16/11/15.
 */

public class HomeBean {

    /**
     * code : 0
     * message : 成功
     * currentTime : 1479219758
     * data : {"cid":"2","pv_id":"{7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA}","count":10,"op":"2","page":1,"min_time":1478690844212,"max_time":1479213961897,"show_time":1479219748,"data":[{"id":"221131","source":"","source_name":"","source_id":"","title":"谁晒的被子？本猫咪征用了啊","type":"2","read_count":"2344","share_count":"0","comment_count":"3","url":"http://html.shehuitu.com/detail/2016/11/15/221131.html?content_id=221131&amp;key=1d6doFU-zj7cwwUrP38rou2haWdlpgEGLUzRQjcVEXKndqdzG__bk32MFI4P64SVwWG_KqXOsd_8S3U8I6kAeRr2QvfR1ytrqdW8E-v0UGra7-SKKmDCrKRzTKbus9WU7Q&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"感觉这一颠簸都能把蛋蛋震碎~~猜到了开头，没猜到结局\u2026\u2026不知道赛后这哥们结果如何，能拿第一了么药不能停啊哥们想必老板也是有故事的人谁晒的被子？本猫咪征用了啊~","tag":["结局","开头","颠簸"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ac4c6ef552.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/15/582ac4c6bb407.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/15/582ac4c6b13c4.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"3","share_type":"0","can_comment":"1","publish_time":"1479213961897","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"flag":1,"imageType":1,"times":1,"type":"ad","slotId":2614221,"cid":"2","op":"2","page":1,"index":1,"tips":"广告","appId":"dbc4db55"},{"id":"221119","source":"","source_name":"","source_id":"","title":"这是海底蜈蚣吧！不过颜色真的太美了","type":"2","read_count":"1218","share_count":"1","comment_count":"10","url":"http://html.shehuitu.com/detail/2016/11/15/221119.html?content_id=221119&amp;key=e40cy17CzRgwTH5tm6_yqznCPsgZUA-tw58h1M4u_M5s01JekILlIHrRAAx2yPJCn6ygyd885fuzXo6zc22d4Ql8THyLa4Ckitg0XEiDvd-DSq2u9nfGqGMvmYoukWmEbA&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"胖嘟嘟的小妹妹，真把人萌翻了这两只老鼠，能把猫咪吃掉这是什么动物，毛茸茸的太可爱了小时候你也这样玩过吧！不过没有他打的准这是海底蜈蚣吧！不过颜色真的太美了考考你们，知道我这是烤的什么吗","tag":["海底","蜈蚣","颜色"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ac3e33ee39.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479213662806","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"221290","source":"","source_name":"","source_id":"","title":"胖哥，你出来乞讨，家是被你吃穷的吧？","type":"2","read_count":"2660","share_count":"0","comment_count":"8","url":"http://html.shehuitu.com/detail/2016/11/15/221290.html?content_id=221290&amp;key=6659lFzK9n36gE1DZurCoumbKcaRURnYY7cCngM9OpqpR_VYaa6JBBe1mRceXGyEYJpFMMc3DPRmI-CCLVHUrYPR72kmx0TVrQYNl5VhVnWf6-laakG_Ix4ptzFNrDsN_g&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"胖哥，你家是吃穷的吧？今天晚上要跪搓衣板了。大姐，这真是太有范了。咦，听说有家饭馆新开张打5折。姑娘，这书很给力啊。那哥们以前也是个渣渣吧，习惯性动作。","tag":["大姐","搓衣板","饭馆"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582aceb66f664.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479213663022","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"221305","source":"","source_name":"","source_id":"","title":"姑娘，你头发剪的两边不一样长啊！","type":"2","read_count":"2855","share_count":"0","comment_count":"6","url":"http://html.shehuitu.com/detail/2016/11/15/221305.html?content_id=221305&amp;key=18d9ZJ-KqLUn_ttuff-0OuYt6BpLwsWncu604vPTaiuKVHBvl5tgOeLv_65rbHWgev_sKWh8SYZa-p--cTFl8EE7GMimj_TaRnWh9HtHaHnZAzUli2XIh9yvEugGIati8Q&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"大姐，你这是要被判刑啊？化学课代表出来解释一下哎妈呀，咋回事莫愁，是你吗爸爸的爸爸叫什么姑娘 你头发剪的两边不一样长啊！","tag":["爸爸","头发","莫愁"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582acfa27b152.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/15/582acfa254695.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/15/582acfa28a034.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"3","share_type":"0","can_comment":"1","publish_time":"1479213362210","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"221104","source":"","source_name":"","source_id":"","title":"姑娘的牙齿好漂亮呀！拍广告不用化妆","type":"2","read_count":"1553","share_count":"0","comment_count":"5","url":"http://html.shehuitu.com/detail/2016/11/15/221104.html?content_id=221104&amp;key=90cc0yOD1ocHuAwgmL_bHY5xd-uhQSuXeLk5DdtybYg4LJrjHKYmlMZcAjD-SZAdVlWKpHGDl95SRvW3G-Fhj-tFeqJacm05O446uGWICVsAbDuGiaBZtMlHL-_uYyYNrw&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"哦哦哦哦！没打着！没打着！台W省就是被这样玩出来的！大鼻子，没谁了姑娘的牙齿好漂亮呀！拍广告不用化妆那位大神的杰作，纸张都被你玩坏了原来自动的背后，都有我们人类在付出","tag":["牙齿","广告","大神"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ac2d592cf0.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479213361995","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"221075","source":"","source_name":"","source_id":"","title":"这也能成为风云人物，一定是原配搞的","type":"2","read_count":"1114","share_count":"1","comment_count":"1","url":"http://html.shehuitu.com/detail/2016/11/15/221075.html?content_id=221075&amp;key=bb90axPwBQw88g7ey080sItk_d3aIS7T3ni_zhCPOtOsGmn9W8uMiiconajBe3RckfzmZRcvn2RCsQRRbvYGZxo_7ltLiAIpZ4-IERB75LLQcAKAUitBRPdwIPMGJcQtEw&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"自娱自乐呢你？小心猴哥过来！这发型是今年的新款吧？还可以这么玩？找个朋友试一试我们三个人害怕你？功夫不行不要装逼这也能成为风云人物","tag":["功夫","风云","害怕"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ac140582ef.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479213062634","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"221313","source":"","source_name":"","source_id":"","title":"这婚纱照拍的，跟窗帘似的！但是人家胸大啊","type":"2","read_count":"2380","share_count":"0","comment_count":"14","url":"http://html.shehuitu.com/detail/2016/11/15/221313.html?content_id=221313&amp;key=a3ecOhrlF3jq_eT9lljP0TTzNks1LB_qpeJRNJxdXB58lEPqjGAeScdTU5VgznU4quV02B8KLy5Ywvl0Q6lEP1Xfvt-r6321pFj4u63TQN_LOnbPHkYqjHEVcAnp96c8Zw&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"这婚纱照拍的 跟窗帘似的！看到这样的红太狼 突然有点羡慕灰太狼！走开 这是我的 计步手环！放开 放开 我CNM！学着点 以后用的上！看起来 很严肃啊！","tag":["婚纱","窗帘","红太狼"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ad02e67db7.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479213063025","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"213699","source":"","source_name":"","source_id":"","title":"这是在讽刺包装冲氮过多吗？","type":"2","read_count":"78939","share_count":"22","comment_count":"129","url":"http://html.shehuitu.com/detail/2016/11/09/213699.html?content_id=213699&amp;key=659c0XvLlHeW3fVTdV7p-KbnnhiR6yS5heKDFO3b8mjvNQnI510hYWEl8REoad_zJ7W6hdrFhnHjpH61U7qXfa6FGrCcjqAjzRkdGWfWZTFp9UI1xalyBTfZh8k8eRHNCQ&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"这是在讽刺包装冲氮过多吗？瑜伽妹子！妹子农村的活不好干，赶紧出城去这舞蹈动作还不够力度现在的年轻人吃饭都想什么呢难得有空陪女票出来晒晒太阳","tag":["瑜伽","力度","氮"],"cover":["http://static.1sapp.com/image/sp/2016/11/09/582320dd4b1a8.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/09/582320dd514c0.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/09/582320dd6fd4e.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"3","share_type":"0","can_comment":"1","publish_time":"1478697182703","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"213698","source":"","source_name":"","source_id":"","title":"他会永远记住这一天。大概一辈子不会靠近雕像了","type":"2","read_count":"23547","share_count":"17","comment_count":"45","url":"http://html.shehuitu.com/detail/2016/11/09/213698.html?content_id=213698&amp;key=9d4fOOQ4lXs6uOUWuLJvPBeNne9ArmHGwZUSs37SCGfx9JydNVGkLKAuhJhQMJB597seG3QRMsQjVgRmanlhGw6IXzSfU9JFbQWcA4Bzsnqt-UEi3N6WQ_Rrqlk4PBN0Cg&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"我开的不是车，我开的是船，有没有兴趣和我一起浪！他会永远记住这一天。大概一辈子不会靠近雕像了马蓉宋喆算是彻底激怒网友了,这个发泄方式我服~高手在民间粑粑粑粑，有电话找你，很急，快接啊！台风妮妲到底有多","tag":["发泄","激怒","开车"],"cover":["http://static.1sapp.com/image/sp/2016/11/09/58231faf47ef0.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1478696880395","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"213594","source":"","source_name":"","source_id":"","title":"为了自己的男人，拼了，美女们都掌下留情啊","type":"2","read_count":"11044","share_count":"10","comment_count":"29","url":"http://html.shehuitu.com/detail/2016/11/09/213594.html?content_id=213594&amp;key=488eiDRkWm4m-w5n0ycSg4c8fXH8KW7MgAvULn8SBzMLOctynARMarjnNH9pfoX4DPPmkgP3uQ_1YOE2Mxlmeb9l8Rl1qvpqKgRxcQ2vX-b_U3LTHCZgUEz_zeZlp7Zh6g&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"看老子的纹身，怕了吧！看到真相吓惨了大叔真好身手啊，彻底拜服了尼玛，坐太久脚麻了\u2026丫的你敢踢老子？！真是活腻歪了为了自己的男人，拼了，美女们都掌下留情啊养喵千日，用喵一时，主银，人家厉害不","tag":["男人","美女","踢"],"cover":["http://static.1sapp.com/image/sp/2016/11/09/5823080f3a28d.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1478690844212","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false}],"top":[]}
     */

    private int code;
    private String message;
    private int currentTime;
    /**
     * cid : 2
     * pv_id : {7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA}
     * count : 10
     * op : 2
     * page : 1
     * min_time : 1478690844212
     * max_time : 1479213961897
     * show_time : 1479219748
     * data : [{"id":"221131","source":"","source_name":"","source_id":"","title":"谁晒的被子？本猫咪征用了啊","type":"2","read_count":"2344","share_count":"0","comment_count":"3","url":"http://html.shehuitu.com/detail/2016/11/15/221131.html?content_id=221131&amp;key=1d6doFU-zj7cwwUrP38rou2haWdlpgEGLUzRQjcVEXKndqdzG__bk32MFI4P64SVwWG_KqXOsd_8S3U8I6kAeRr2QvfR1ytrqdW8E-v0UGra7-SKKmDCrKRzTKbus9WU7Q&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"感觉这一颠簸都能把蛋蛋震碎~~猜到了开头，没猜到结局\u2026\u2026不知道赛后这哥们结果如何，能拿第一了么药不能停啊哥们想必老板也是有故事的人谁晒的被子？本猫咪征用了啊~","tag":["结局","开头","颠簸"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ac4c6ef552.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/15/582ac4c6bb407.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/15/582ac4c6b13c4.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"3","share_type":"0","can_comment":"1","publish_time":"1479213961897","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"flag":1,"imageType":1,"times":1,"type":"ad","slotId":2614221,"cid":"2","op":"2","page":1,"index":1,"tips":"广告","appId":"dbc4db55"},{"id":"221119","source":"","source_name":"","source_id":"","title":"这是海底蜈蚣吧！不过颜色真的太美了","type":"2","read_count":"1218","share_count":"1","comment_count":"10","url":"http://html.shehuitu.com/detail/2016/11/15/221119.html?content_id=221119&amp;key=e40cy17CzRgwTH5tm6_yqznCPsgZUA-tw58h1M4u_M5s01JekILlIHrRAAx2yPJCn6ygyd885fuzXo6zc22d4Ql8THyLa4Ckitg0XEiDvd-DSq2u9nfGqGMvmYoukWmEbA&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"胖嘟嘟的小妹妹，真把人萌翻了这两只老鼠，能把猫咪吃掉这是什么动物，毛茸茸的太可爱了小时候你也这样玩过吧！不过没有他打的准这是海底蜈蚣吧！不过颜色真的太美了考考你们，知道我这是烤的什么吗","tag":["海底","蜈蚣","颜色"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ac3e33ee39.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479213662806","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"221290","source":"","source_name":"","source_id":"","title":"胖哥，你出来乞讨，家是被你吃穷的吧？","type":"2","read_count":"2660","share_count":"0","comment_count":"8","url":"http://html.shehuitu.com/detail/2016/11/15/221290.html?content_id=221290&amp;key=6659lFzK9n36gE1DZurCoumbKcaRURnYY7cCngM9OpqpR_VYaa6JBBe1mRceXGyEYJpFMMc3DPRmI-CCLVHUrYPR72kmx0TVrQYNl5VhVnWf6-laakG_Ix4ptzFNrDsN_g&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"胖哥，你家是吃穷的吧？今天晚上要跪搓衣板了。大姐，这真是太有范了。咦，听说有家饭馆新开张打5折。姑娘，这书很给力啊。那哥们以前也是个渣渣吧，习惯性动作。","tag":["大姐","搓衣板","饭馆"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582aceb66f664.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479213663022","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"221305","source":"","source_name":"","source_id":"","title":"姑娘，你头发剪的两边不一样长啊！","type":"2","read_count":"2855","share_count":"0","comment_count":"6","url":"http://html.shehuitu.com/detail/2016/11/15/221305.html?content_id=221305&amp;key=18d9ZJ-KqLUn_ttuff-0OuYt6BpLwsWncu604vPTaiuKVHBvl5tgOeLv_65rbHWgev_sKWh8SYZa-p--cTFl8EE7GMimj_TaRnWh9HtHaHnZAzUli2XIh9yvEugGIati8Q&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"大姐，你这是要被判刑啊？化学课代表出来解释一下哎妈呀，咋回事莫愁，是你吗爸爸的爸爸叫什么姑娘 你头发剪的两边不一样长啊！","tag":["爸爸","头发","莫愁"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582acfa27b152.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/15/582acfa254695.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/15/582acfa28a034.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"3","share_type":"0","can_comment":"1","publish_time":"1479213362210","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"221104","source":"","source_name":"","source_id":"","title":"姑娘的牙齿好漂亮呀！拍广告不用化妆","type":"2","read_count":"1553","share_count":"0","comment_count":"5","url":"http://html.shehuitu.com/detail/2016/11/15/221104.html?content_id=221104&amp;key=90cc0yOD1ocHuAwgmL_bHY5xd-uhQSuXeLk5DdtybYg4LJrjHKYmlMZcAjD-SZAdVlWKpHGDl95SRvW3G-Fhj-tFeqJacm05O446uGWICVsAbDuGiaBZtMlHL-_uYyYNrw&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"哦哦哦哦！没打着！没打着！台W省就是被这样玩出来的！大鼻子，没谁了姑娘的牙齿好漂亮呀！拍广告不用化妆那位大神的杰作，纸张都被你玩坏了原来自动的背后，都有我们人类在付出","tag":["牙齿","广告","大神"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ac2d592cf0.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479213361995","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"221075","source":"","source_name":"","source_id":"","title":"这也能成为风云人物，一定是原配搞的","type":"2","read_count":"1114","share_count":"1","comment_count":"1","url":"http://html.shehuitu.com/detail/2016/11/15/221075.html?content_id=221075&amp;key=bb90axPwBQw88g7ey080sItk_d3aIS7T3ni_zhCPOtOsGmn9W8uMiiconajBe3RckfzmZRcvn2RCsQRRbvYGZxo_7ltLiAIpZ4-IERB75LLQcAKAUitBRPdwIPMGJcQtEw&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"自娱自乐呢你？小心猴哥过来！这发型是今年的新款吧？还可以这么玩？找个朋友试一试我们三个人害怕你？功夫不行不要装逼这也能成为风云人物","tag":["功夫","风云","害怕"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ac140582ef.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479213062634","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"221313","source":"","source_name":"","source_id":"","title":"这婚纱照拍的，跟窗帘似的！但是人家胸大啊","type":"2","read_count":"2380","share_count":"0","comment_count":"14","url":"http://html.shehuitu.com/detail/2016/11/15/221313.html?content_id=221313&amp;key=a3ecOhrlF3jq_eT9lljP0TTzNks1LB_qpeJRNJxdXB58lEPqjGAeScdTU5VgznU4quV02B8KLy5Ywvl0Q6lEP1Xfvt-r6321pFj4u63TQN_LOnbPHkYqjHEVcAnp96c8Zw&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"这婚纱照拍的 跟窗帘似的！看到这样的红太狼 突然有点羡慕灰太狼！走开 这是我的 计步手环！放开 放开 我CNM！学着点 以后用的上！看起来 很严肃啊！","tag":["婚纱","窗帘","红太狼"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ad02e67db7.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479213063025","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"213699","source":"","source_name":"","source_id":"","title":"这是在讽刺包装冲氮过多吗？","type":"2","read_count":"78939","share_count":"22","comment_count":"129","url":"http://html.shehuitu.com/detail/2016/11/09/213699.html?content_id=213699&amp;key=659c0XvLlHeW3fVTdV7p-KbnnhiR6yS5heKDFO3b8mjvNQnI510hYWEl8REoad_zJ7W6hdrFhnHjpH61U7qXfa6FGrCcjqAjzRkdGWfWZTFp9UI1xalyBTfZh8k8eRHNCQ&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"这是在讽刺包装冲氮过多吗？瑜伽妹子！妹子农村的活不好干，赶紧出城去这舞蹈动作还不够力度现在的年轻人吃饭都想什么呢难得有空陪女票出来晒晒太阳","tag":["瑜伽","力度","氮"],"cover":["http://static.1sapp.com/image/sp/2016/11/09/582320dd4b1a8.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/09/582320dd514c0.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/09/582320dd6fd4e.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"3","share_type":"0","can_comment":"1","publish_time":"1478697182703","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"213698","source":"","source_name":"","source_id":"","title":"他会永远记住这一天。大概一辈子不会靠近雕像了","type":"2","read_count":"23547","share_count":"17","comment_count":"45","url":"http://html.shehuitu.com/detail/2016/11/09/213698.html?content_id=213698&amp;key=9d4fOOQ4lXs6uOUWuLJvPBeNne9ArmHGwZUSs37SCGfx9JydNVGkLKAuhJhQMJB597seG3QRMsQjVgRmanlhGw6IXzSfU9JFbQWcA4Bzsnqt-UEi3N6WQ_Rrqlk4PBN0Cg&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"我开的不是车，我开的是船，有没有兴趣和我一起浪！他会永远记住这一天。大概一辈子不会靠近雕像了马蓉宋喆算是彻底激怒网友了,这个发泄方式我服~高手在民间粑粑粑粑，有电话找你，很急，快接啊！台风妮妲到底有多","tag":["发泄","激怒","开车"],"cover":["http://static.1sapp.com/image/sp/2016/11/09/58231faf47ef0.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1478696880395","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false},{"id":"213594","source":"","source_name":"","source_id":"","title":"为了自己的男人，拼了，美女们都掌下留情啊","type":"2","read_count":"11044","share_count":"10","comment_count":"29","url":"http://html.shehuitu.com/detail/2016/11/09/213594.html?content_id=213594&amp;key=488eiDRkWm4m-w5n0ycSg4c8fXH8KW7MgAvULn8SBzMLOctynARMarjnNH9pfoX4DPPmkgP3uQ_1YOE2Mxlmeb9l8Rl1qvpqKgRxcQ2vX-b_U3LTHCZgUEz_zeZlp7Zh6g&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"看老子的纹身，怕了吧！看到真相吓惨了大叔真好身手啊，彻底拜服了尼玛，坐太久脚麻了\u2026丫的你敢踢老子？！真是活腻歪了为了自己的男人，拼了，美女们都掌下留情啊养喵千日，用喵一时，主银，人家厉害不","tag":["男人","美女","踢"],"cover":["http://static.1sapp.com/image/sp/2016/11/09/5823080f3a28d.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1478690844212","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479219748,"is_favorite":false}]
     * top : []
     */

    private WDataBean data;

    public static HomeBean objectFromData(String str) {

        return new Gson().fromJson(str, HomeBean.class);
    }

    public static HomeBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), HomeBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<HomeBean> arrayHomeBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<HomeBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<HomeBean> arrayHomeBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<HomeBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public WDataBean getData() {
        return data;
    }

    public void setData(WDataBean data) {
        this.data = data;
    }

    public static class WDataBean {
        private String cid;
        private String pv_id;
        private int count;
        private String op;
        private int page;
        private long min_time;
        private long max_time;
        private int show_time;
        /**
         * id : 221131
         * source :
         * source_name :
         * source_id :
         * title : 谁晒的被子？本猫咪征用了啊
         * type : 2
         * read_count : 2344
         * share_count : 0
         * comment_count : 3
         * url : http://html.shehuitu.com/detail/2016/11/15/221131.html?content_id=221131&amp;key=1d6doFU-zj7cwwUrP38rou2haWdlpgEGLUzRQjcVEXKndqdzG__bk32MFI4P64SVwWG_KqXOsd_8S3U8I6kAeRr2QvfR1ytrqdW8E-v0UGra7-SKKmDCrKRzTKbus9WU7Q&amp;pv_id=%7B7678D1A9-BADF-3B26-FD4B-FCCA007EA4FA%7D&amp;cid=2&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0
         * is_hot : 0
         * is_top : 0
         * introduction : 感觉这一颠簸都能把蛋蛋震碎~~猜到了开头，没猜到结局……不知道赛后这哥们结果如何，能拿第一了么药不能停啊哥们想必老板也是有故事的人谁晒的被子？本猫咪征用了啊~
         * tag : ["结局","开头","颠簸"]
         * cover : ["http://static.1sapp.com/image/sp/2016/11/15/582ac4c6ef552.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/15/582ac4c6bb407.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/15/582ac4c6b13c4.png?imageView2/2/w/200/h/150/q/70/format/jpeg"]
         * cover_show_type : 3
         * share_type : 0
         * can_comment : 1
         * publish_time : 1479213961897
         * content_type : 1
         * unlike_enable : 0
         * show_comment : 0
         * tips :
         * font_color :
         * font_bold : 0
         * show_time : 1479219748
         * is_favorite : false
         */

        private List<DataBean> data;
        private List<?> top;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public static DataBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), DataBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<DataBean> arrayDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<DataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<DataBean> arrayDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getPv_id() {
            return pv_id;
        }

        public void setPv_id(String pv_id) {
            this.pv_id = pv_id;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getOp() {
            return op;
        }

        public void setOp(String op) {
            this.op = op;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public long getMin_time() {
            return min_time;
        }

        public void setMin_time(long min_time) {
            this.min_time = min_time;
        }

        public long getMax_time() {
            return max_time;
        }

        public void setMax_time(long max_time) {
            this.max_time = max_time;
        }

        public int getShow_time() {
            return show_time;
        }

        public void setShow_time(int show_time) {
            this.show_time = show_time;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public List<?> getTop() {
            return top;
        }

        public void setTop(List<?> top) {
            this.top = top;
        }

        public class DataBean {
            private String id;
            private String source;
            private String source_name;
            private String source_id;
            private String title;
            private String type;
            private String read_count;
            private String share_count;
            private String comment_count;
            private String url;
            private String is_hot;
            private String is_top;
            private String introduction;
            private String cover_show_type;
            private String share_type;
            private String can_comment;
            private String publish_time;
            private String content_type;
            private int unlike_enable;
            private int show_comment;
            private String tips;
            private String font_color;
            private int font_bold;
            private int show_time;
            private boolean is_favorite;
            private List<String> tag;
            private List<String> cover;

            public DataBean objectFromData(String str) {

                return new Gson().fromJson(str, DataBean.class);
            }

            public DataBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), DataBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public List<DataBean> arrayDataBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public List<DataBean> arrayDataBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<DataBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getSource_name() {
                return source_name;
            }

            public void setSource_name(String source_name) {
                this.source_name = source_name;
            }

            public String getSource_id() {
                return source_id;
            }

            public void setSource_id(String source_id) {
                this.source_id = source_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getRead_count() {
                return read_count;
            }

            public void setRead_count(String read_count) {
                this.read_count = read_count;
            }

            public String getShare_count() {
                return share_count;
            }

            public void setShare_count(String share_count) {
                this.share_count = share_count;
            }

            public String getComment_count() {
                return comment_count;
            }

            public void setComment_count(String comment_count) {
                this.comment_count = comment_count;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getIs_hot() {
                return is_hot;
            }

            public void setIs_hot(String is_hot) {
                this.is_hot = is_hot;
            }

            public String getIs_top() {
                return is_top;
            }

            public void setIs_top(String is_top) {
                this.is_top = is_top;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }

            public String getCover_show_type() {
                return cover_show_type;
            }

            public void setCover_show_type(String cover_show_type) {
                this.cover_show_type = cover_show_type;
            }

            public String getShare_type() {
                return share_type;
            }

            public void setShare_type(String share_type) {
                this.share_type = share_type;
            }

            public String getCan_comment() {
                return can_comment;
            }

            public void setCan_comment(String can_comment) {
                this.can_comment = can_comment;
            }

            public String getPublish_time() {
                return publish_time;
            }

            public void setPublish_time(String publish_time) {
                this.publish_time = publish_time;
            }

            public String getContent_type() {
                return content_type;
            }

            public void setContent_type(String content_type) {
                this.content_type = content_type;
            }

            public int getUnlike_enable() {
                return unlike_enable;
            }

            public void setUnlike_enable(int unlike_enable) {
                this.unlike_enable = unlike_enable;
            }

            public int getShow_comment() {
                return show_comment;
            }

            public void setShow_comment(int show_comment) {
                this.show_comment = show_comment;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }

            public String getFont_color() {
                return font_color;
            }

            public void setFont_color(String font_color) {
                this.font_color = font_color;
            }

            public int getFont_bold() {
                return font_bold;
            }

            public void setFont_bold(int font_bold) {
                this.font_bold = font_bold;
            }

            public int getShow_time() {
                return show_time;
            }

            public void setShow_time(int show_time) {
                this.show_time = show_time;
            }

            public boolean isIs_favorite() {
                return is_favorite;
            }

            public void setIs_favorite(boolean is_favorite) {
                this.is_favorite = is_favorite;
            }

            public List<String> getTag() {
                return tag;
            }

            public void setTag(List<String> tag) {
                this.tag = tag;
            }

            public List<String> getCover() {
                return cover;
            }

            public void setCover(List<String> cover) {
                this.cover = cover;
            }
        }
    }
}
