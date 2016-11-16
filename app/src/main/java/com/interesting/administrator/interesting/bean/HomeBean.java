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
     * cid : 255
     * pv_id : {9FA8D98E-F540-0720-00C8-E49E22505E5C}
     * count : 10
     * op : 2
     * page : 1
     * min_time : 1479294662491
     * max_time : 1479296462637
     * show_time : 1479296902
     * data : [{"id":"223471","source":"","source_name":"","source_id":"","title":"台湾南投县一采茶车超载失火 造成1死4伤","type":"1","read_count":"33267","share_count":"13","comment_count":"148","url":"http://html.shehuitu.com/detail/2016/11/16/223471.html?content_id=223471&amp;key=fa97JmXAkoZDVGpCITO0u_Wp9mW6OEvk-mBVTf8hwWDhepqvtDBGwOAVx3cEAytpThbK8B5lqOhmiyOKwb0qMbumrsm6NFqwVLbU5Sp8WAAy5dyHK589uKlbRoElBWOUKQ&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=1&amp;rss_source=&amp;fr=12&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"2","is_top":"0","introduction":"据台湾报道，台湾南投县 60岁陈姓妇人今天早晨载着多名采茶妇人要前往杉林溪采茶，途中发生火烧车意外，74岁刘姓女采茶工逃生不及被火烧死，酿成1死4伤悲剧。事故原因正在调查中。据指出，附近居民清晨听到两","tag":["台湾","火烧车","采茶"],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c2567083b2.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479290281298","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479290281,"is_favorite":false},{"flag":1,"imageType":1,"times":1,"type":"ad","slotId":2614221,"cid":"255","op":"2","page":1,"index":1,"tips":"广告","appId":"dbc4db55"},{"id":"223496","source":"","source_name":"","source_id":"","title":"新疆脑瘫小伙没上一天学 做电商月薪三千元","type":"1","read_count":"39248","share_count":"30","comment_count":"286","url":"http://html.shehuitu.com/detail/2016/11/16/223496.html?content_id=223496&amp;key=bdf5UmQlM6GqrRhPtyC80v9U-XbmfGPB80glkcIgbe4pY3btkwrYGWX2ASJo87yMHGm0UKgMQlAnDxE4zHv3Gg86AkyhOM7N_YKMGNECSXqieUFkP9vfEQHPR-0394QbnQ&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=1&amp;rss_source=&amp;fr=12&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"2","is_top":"0","introduction":"屏幕上显示韩凯用一个指头敲的字和页面。韩凯用左手的一根指头在键盘上打字，回答记者的提问。韩凯右手扶着轮椅的扶手，左手无名指用搜狗拼音输入法打字：\u201c我拼命挣钱，为了能够到内地大医院治好我的病。\u201d此间近日","tag":["新疆","脑瘫","电商"],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c26a96d9d8.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/16/582c26a965781.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/16/582c26a965150.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"3","share_type":"0","can_comment":"1","publish_time":"1479290702199","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479290702,"is_favorite":false},{"id":"223464","source":"","source_name":"","source_id":"","title":"服务员打扫客房看见遗书 警方赶来阻止男子轻生","type":"1","read_count":"43146","share_count":"7","comment_count":"210","url":"http://html.shehuitu.com/detail/2016/11/16/223464.html?content_id=223464&amp;key=7a90QYES_JL7AHavWXrGNKSJB7EJdzDHBytVzHWDi2NUzU_dGLpl8hFBQ9wgo7P-gNup-s1ouPrwFai0ZtX6qyLB1OIUvGj3rSLvDVYhLaO2MZhjf8LniqI_VJEOKvAIXQ&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=1&amp;rss_source=&amp;fr=12&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"2","is_top":"0","introduction":"11月9日，屯溪一宾馆服务员 在打扫客房时，发现房间里留有一封遗书，房客此时已经不知所踪，大骇之下报警。警方赶到调查时，遇到割腕、大量服药都没死成，买药回来准备继续服药自杀的房客小陈，经过耐心劝说，终","tag":["服务员","遗书","轻生"],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c24d4d3945.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479289982200","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479289982,"is_favorite":false},{"id":"204777","source":"","source_name":"","source_id":"","title":"今夜斗地主开赛了：点击下载连赢5局送现金红包！","type":"13","read_count":"0","share_count":"0","comment_count":"0","url":"http://g.fastapi.net/d?si=1018975&amp;aid=580640&amp;tp=c&amp;content_id=204777&amp;key=9bc0f3bQ-R4VdbcsiWVnwGMASbVLp20eXtU01KQupow6xA2XoECaMyUZB7S6f5Mgr2hdFdFSXv6UHrrgkmQkd16dQsfe-tpGajyv46E31t6sULat5AQIS3_nFVYZ3VFE2w&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=13&amp;rss_source=&amp;fr=14&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"1","is_top":"1","introduction":"","tag":[],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c419d13468.jpg?imageView2/2/w/200/h/150/q/70"],"cover_show_type":"1","share_type":"0","can_comment":"2","publish_time":"1479295393981","content_type":"5","unlike_enable":0,"show_comment":0,"tips":"广告","font_color":"","font_bold":"","show_time":1479296842,"is_favorite":false},{"id":"223029","source":"","source_name":"","source_id":"","title":"李泽楷错卖腾讯股票损失4000亿 是他爸一辈子赚的钱","type":"10","read_count":"499","share_count":"0","comment_count":"3","url":"http://html.shehuitu.com/detail/2016/11/16/223029.html?content_id=223029&amp;key=a2d0b2a1Z-5a2oOlMNmWUe-d5KRKs4iPmHgsSK9pmlcdSXn7m47t8ZqZl3oiaVyPvJLxTbjq0O7_pn2R8GMabvpGblMxBcJK7NYSkmi-Pz8mdNvAWbc5glDXwKxI4sDx6w&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=10&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"都说龙生龙，凤生凤，老鼠的儿子会打洞，今天我们聊聊李嘉诚的儿子李泽楷，他是不是也像李嘉诚一样赚钱如有神助呢?答案是否定的。为啥?就因为他将本可以轻轻松松超越他父亲的财富时机会拱手让给了别人。事情是这样","tag":["李泽楷","李嘉诚","股票","财产"],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c074923eeb.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479295862516","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479296902,"is_favorite":false},{"id":"223039","source":"","source_name":"","source_id":"","title":"我选右边，左边的鼻孔长的太奇怪了","type":"2","read_count":"355","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/16/223039.html?content_id=223039&amp;key=f221AhOdG_oiGYooaPH_f2ghxS6ujIWauPWVze8uhBFTKFR8OIGwGLFZgIYyMI9jMmqoxo50rEB4-tsXDMKUwaSHmyCyK92_9cX8ok9z9ndxkaMJOES0rp1uxqU8eeENFg&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=2&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"实在是找不到刀了。。好像被什么盯上了天气冷了之后，我家猫咪整天就是这样了你们能看出这是什么车吗战斗民族的活动左边还是右边？","tag":["战斗","活动","民族"],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c0806261dd.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479296462272","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479296902,"is_favorite":false},{"id":"223660","source":"","source_name":"","source_id":"","title":"父亲贪钱把女儿送人，女儿街头下跪求不嫁","type":"1","read_count":"352","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/16/223660.html?content_id=223660&amp;key=1bb3s9BCy9IOVsRYjKLwD7r87vfJ8KHEdBNMUz_21zd7hEQlDDTnYZfN11HRLqjRog2C9HXLzynV7V9RzfTbwgEeZyBy6VKlui7hrY-hC9c4D3fTDLvJ46P4CUvWOIE4dQ&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=1&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"在江西于都火车站，一女子街头下跪，哭诉着不肯走。路人围观后怀疑有情况，就报警了。原来，女儿父亲因为爱钱。不经过女儿的同意就将女儿嫁到抚州去，男方过来接女孩后，女孩不肯，才有了火车站跪求的情况。边上拉着","tag":["父亲","贪钱","街头"],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c35c378a3a.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479296462536","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479296902,"is_favorite":false},{"id":"223700","source":"球星网","source_name":"","source_id":"球星网","title":"鲁能帮一原因被里皮放弃 高洪波核心坐穿板凳 恒大太无情？","type":"13","read_count":"965","share_count":"0","comment_count":"0","url":"http://www.qiuxingwang.cn/qu/444556.html?content_id=223700&amp;key=9a9eoP4BaPuNbidXFIlZOwDiJO3CGHUopDCdyvuCsBSOIMe_GuniC6xfaLFNH-r5RiDfqvL9xwLtSG2dT5_2d14PP2sv_ojwQAcmJeXsSWVcrLFcwpsNgHox128ITPcRmA&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=13&amp;rss_source=%E7%90%83%E6%98%9F%E7%BD%91&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"里皮上任后的第一场正式比赛以平局收场，首秀不胜的魔咒仍在延续，但里皮兑现了赛前承诺，他让球迷看到了国足的改变，因此球迷和媒体对这个平局似乎都很满意，因为国足终于踢了一场很舒心的比赛，尽管没有进球略显遗","tag":["鲁能","里皮","恒大"],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c38ce0b1f5.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/16/582c38ce11055.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/16/582c38ce0075e.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"3","share_type":"0","can_comment":"1","publish_time":"1479295863271","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479296902,"is_favorite":false},{"id":"223676","source":"","source_name":"","source_id":"","title":"冬天手脚冰凉，吃它进补，这个冬天不怕冷，补起来！","type":"12","read_count":"183","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/16/223676.html?content_id=223676&amp;key=7b1cPmRlP0Q0kzsaDlSyJng8hPLO3u3YQqYhjslQI_jcVfOiGQCvuwng1XNm3ljGvgSx0fTkjgfM4HJYeBFqcGrpGqeOX85HVJDYCInSPQRVjAB8dBdZ21hXYOYtJd1HwA&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=12&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"冬天来了?从小气血不足，一到冬天手脚冰凉，这时候进补，这个冬天不怕冷，补起来。这是一道能量满满的肉肉菜，用啤酒代替了水来焖，使得猪手更加地香软，并且还带着一丝啤酒独有的香味，起到了去腥增香的作用，非常","tag":["猪手","花生米","啤酒"],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c36c8564be.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479296462637","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479296902,"is_favorite":false},{"id":"223049","source":"","source_name":"","source_id":"","title":"北京商住楼： 严控风暴下开发商\u201c锁\u201d上样板间","type":"10","read_count":"538","share_count":"0","comment_count":"1","url":"http://html.shehuitu.com/detail/2016/11/16/223049.html?content_id=223049&amp;key=d5dbCA4BRK0aNZc0wZVRjBHOh_RSAuDlvHFofF9M61iPMVihNoWrtsHurz1_paCYeVB1WKgYWpLI2XeCaCTHW9YsCyBpIF6y-ZXFj0T0lCgBjxpB_x3IRelvfIgqf6on_Q&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=10&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"开发商明显感受到当前北京市对商住市场的调控比以往更严格。记者近期实地走访发现，北京市商住项目如今在推广和销售环节都非常谨慎。北京市顺义区县严格要求商改住项目不得设置样板间。此前已经设计了样板间的开发商","tag":["商住房","开发商","购买","政策"],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c091bdc0d7.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/16/582c091b82dec.png?imageView2/2/w/200/h/150/q/70/format/jpeg","http://static.1sapp.com/image/sp/2016/11/16/582c091bbf2bd.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"3","share_type":"0","can_comment":"1","publish_time":"1479294662491","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479296902,"is_favorite":false},{"id":"223581","source":"","source_name":"","source_id":"","title":"刘禅并非昏庸帝王，诸葛亮为何迟迟不肯还权","type":"3","read_count":"721","share_count":"0","comment_count":"4","url":"http://html.shehuitu.com/detail/2016/11/16/223581.html?content_id=223581&amp;key=21dedKs6NF5qjCsLu3k1-Dl9AcMCu26o5swmXjeXkFwkdol2Z45MuYcJp-OXqiZh_mDffkfdPVdBGC7asI3KikQ77nqS1So77zblYViCdfV2-NFW3F94DSAdy4Gxe8EETw&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=3&amp;rss_source=&amp;fr=11&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"诸葛亮从刘备死后独揽大权一直到死，始终不肯放下手中的权力。刘禅等于是名义上的国家元首，诸葛亮才是真正的蜀国执政者。有人说，诸葛亮之所以不放下权力，是因为刘禅对朝政不熟。这又是无稽之谈了。首先，刘禅虽然","tag":["刘禅","刘备","诸葛亮"],"cover":["http://static.1sapp.com/image/sp/2016/11/16/582c2b798b55f.png?imageView2/2/w/200/h/150/q/70/format/jpeg"],"cover_show_type":"1","share_type":"0","can_comment":"1","publish_time":"1479295262203","content_type":"1","unlike_enable":0,"show_comment":0,"tips":"","font_color":"","font_bold":0,"show_time":1479296902,"is_favorite":false}]
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

    public WDataBean getData() {
        return data;
    }

    public void setData(WDataBean data) {
        this.data = data;
    }

    public static class WDataBean {
        /**
         * id : 223471
         * source :
         * source_name :
         * source_id :
         * title : 台湾南投县一采茶车超载失火 造成1死4伤
         * type : 1
         * read_count : 33267
         * share_count : 13
         * comment_count : 148
         * url : http://html.shehuitu.com/detail/2016/11/16/223471.html?content_id=223471&amp;key=fa97JmXAkoZDVGpCITO0u_Wp9mW6OEvk-mBVTf8hwWDhepqvtDBGwOAVx3cEAytpThbK8B5lqOhmiyOKwb0qMbumrsm6NFqwVLbU5Sp8WAAy5dyHK589uKlbRoElBWOUKQ&amp;pv_id=%7B9FA8D98E-F540-0720-00C8-E49E22505E5C%7D&amp;cid=255&amp;cat=1&amp;rss_source=&amp;fr=12&amp;o=2&amp;p=1&amp;skip_ad=0
         * is_hot : 2
         * is_top : 0
         * introduction : 据台湾报道，台湾南投县 60岁陈姓妇人今天早晨载着多名采茶妇人要前往杉林溪采茶，途中发生火烧车意外，74岁刘姓女采茶工逃生不及被火烧死，酿成1死4伤悲剧。事故原因正在调查中。据指出，附近居民清晨听到两
         * tag : ["台湾","火烧车","采茶"]
         * cover : ["http://static.1sapp.com/image/sp/2016/11/16/582c2567083b2.png?imageView2/2/w/200/h/150/q/70/format/jpeg"]
         * cover_show_type : 1
         * share_type : 0
         * can_comment : 1
         * publish_time : 1479290281298
         * content_type : 1
         * unlike_enable : 0
         * show_comment : 0
         * tips :
         * font_color :
         * font_bold : 0
         * show_time : 1479290281
         * is_favorite : false
         */

        private List<DataBean> data;

        public static WDataBean objectFromData(String str) {

            return new Gson().fromJson(str, WDataBean.class);
        }

        public static WDataBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), WDataBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<WDataBean> arrayWDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<WDataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<WDataBean> arrayWDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<WDataBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            private String title;
            private String comment_count;
            private String url;
            private String introduction;
            private String cover_show_type;
            private String publish_time;
            private String tips;
            private String font_color;
            private int show_time;
            private boolean is_favorite;
            private List<String> tag;
            private List<String> cover;

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

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
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

            public String getPublish_time() {
                return publish_time;
            }

            public void setPublish_time(String publish_time) {
                this.publish_time = publish_time;
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
