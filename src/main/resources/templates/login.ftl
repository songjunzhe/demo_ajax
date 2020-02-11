<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <title>login</title>
    <link rel="stylesheet" href="css/style.css">

    <script src="js/jquery-2.2.4.min.js"></script>



    <script>
        $(function(){
            $("[name='LoginName']").blur(function(){
                //获得文本框中的内容
                var loginname= $(this).val();
                if($.trim(loginname).length==0){
                    alert("请输入用户名");
                }else{
                    //使用ajax发送数据给后台
                    $.ajax({
                        url:"/checkname",
                        data:"username="+loginname,
                        type:"post",
                        dataType:"json",
                        success:function(rs){
                            //  alert(rs.str);
                            $("[name='LoginName']").next().html(rs.str);

                        }
                    });
                }
            });
        })

    </script>
    <script  type="text/javascript" rel="stylesheet">
        $(function(){
        // 点击获取验证码操作
        $('.feachBtn').click(function() {
            let count = 60;
            const countDown = setInterval(() => {
                if (count === 0) {
                    $('.feachBtn').text('重新发送').removeAttr('disabled');
                    $('.feachBtn').css({
                        background: '#ff9400',
                        color: '#fff',
                    });
                    clearInterval(countDown);
                } else {
                    $('.feachBtn').attr('disabled', true);
                    $('.feachBtn').css({
                        background: '#d8d8d8',
                        color: '#707070',
                    });
                    $('.feachBtn').text(count + '秒后可重新获取');
                }
                count--;
            }, 1000);
        })
        });
    </script>
</head>

<body>
<div class="content">
    <form action="/logins" method="post">
        <div class="form sign-in">
            <h2>密码登录</h2>
            <label>
                <span>用户名</span>
                <input type="text" name="LoginName" value="${loginname!}"/><span></span>
            </label>
            <label>
                <span>密码</span>
                <input type="password" name="password"/><span style="color: red">${msg!}</span>
            </label>
            <p class="forgot-pass"><a href="javascript:">忘记密码？</a></p>
            <div>
                <br>
            </div>
            <div align="center">
                <span style="color: red">${msg1!}</span>
            </div>
            <button type="submit" class="submit">登 录</button>
        </div>
    </form>

    <div class="sub-cont">
        <div class="img">
            <div class="img__text m--up">
                <h2>忘记账号？</h2>
                <p>使用短信验证码登录！</p>
            </div>
            <div class="img__text m--in">
                <h2>不能接收短信？</h2>
                <p>快使用帐号登录吧，好久不见了！</p>
            </div>
            <div class="img__btn">
                <span class="m--up">短 信</span>
                <span class="m--in">账 号</span>
            </div>
        </div>
        <form action="/regist" method="post">
            <div class="form sign-up">
                <h2>短信登陆</h2>
                <label>
                    <span>手机号</span>
                    <input type="text"  />
                </label>

                <label>
                    <span>验证码</span>
                    <input type="password" />
                </label>
                <br>
                <div align="center">
                    <a style="color: black"  class="feachBtn">获取验证码</a>
                </div>
                <button type="button" class="submit">登  录</button>


            </div>
        </form>

    </div>

</div>

<script src="js/script.js"></script>
</body>

</html>