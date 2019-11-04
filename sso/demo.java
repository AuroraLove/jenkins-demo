/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/register 01.注册，json传参
 * @apiName register
 * @apiGroup 01.服务端认证中心
 * @apiParam {Long} phone 手机号，非空（需校验）
 * @apiParam {String} password 用户密码，非空
 * @apiParam {String} rePassword 重复用户密码，非空
 * @apiParam {String} code 手机验证码，非空
 * @apiParamExample {json} Request-Example:
 * {
 * "phone":12345678910,
 * "password":"a123456",
 * "rePassword":"a123456",
 * "code":"1234"
 * }
 * @apiSuccess {Long} id 用户id
 * @apiSuccess {String} userName 用户名
 * @apiSuccess {String} checkStatus 用户状态
 * @apiSuccessExample {json} Success-Response:
 * {
 * "status": 200,
 * "message": "成功",
 * "data": {
 * "id": 1312370556928,
 * "name": "zyu",
 * "checkStatus": 2
 * },
 * "timeStamp": "2019-05-07 12:00:24"
 * }
 * @apiErrorExample {json} Error-Response:
 * {
 * "status": 10001,
 * "message": "用户账号已存在！",
 * "data": {
 * "name": "INVALID_FIELD",
 * "domainCode": null,
 * "message": "无效字段或参数",
 * "resource": null,
 * "debugId": null,
 * "details": [
 * {
 * "field": "userName",
 * "value": "zyu2",
 * "issue": "用户账号已存在！"
 * }
 * ]
 * },
 * "timestamp": "2019-05-07 11:49:03"
 * }
 *  @apiVersion 0.1.0
 */


/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/login 02.登录，form-data传参
 * @apiName login
 * @apiGroup 01.服务端认证中心
 * @apiParam {Long} phone 用户登录手机号，非空
 * @apiParam {String} password 用户密码，非空
 * @apiParam {Long} appId 站点id
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "userId": 1312370556928,
 *         "userName": "zyu",
 *         "userToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEzMTIzNzA1NTY5MjgsImlzcyI6Imh0dHA6Ly93d3cuYmx1ZXRoaW5rLmNuIiwiaWF0IjoxNTU3MjA3NzMzfQ.06gxVYjmZYW0kokU5zvs-vY7E2sTNCcFTxJNHnFhJko",
 *         "clientToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhcHAiOjIyMzY2Nzk1MDc5NjgsInVpZCI6MTMxMjM3MDU1NjkyOCwiaXNzIjoiaHR0cDovL3d3dy5ibHVldGhpbmsuY24iLCJpYXQiOjE1NTcyMDc3MzN9.yjbKyi24oea04Oh8hYN1uwlZ8e7L7sCyMftV0tq0g8c",
 *         "callbackUrl": "http://localhost:3000/#/index"
 *     },
 *     "timeStamp": "2019-05-07 13:42:16"
 * }
 *@apiErrorExample {json} Error-Response:
 *{
 *     "status": 10001,
 *     "message": "用户账号或登录密码错误！",
 *     "data": {
 *         "name": "INVALID_FIELD",
 *         "domainCode": null,
 *         "message": "无效字段或参数",
 *         "resource": null,
 *         "debugId": null,
 *         "details": [
 *             {
 *                 "field": "password",
 *                 "value": "123456",
 *                 "issue": "用户账号或登录密码错误！"
 *             }
 *         ]
 *     },
 *     "timestamp": "2019-05-07 12:43:42"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {get} http://10.17.18.98:8002/gx-sso-server/auth/loginToken 03.token登录
 * @apiName loginToken
 * @apiGroup 01.服务端认证中心
 * @apiHeader {String} token 用户登录令牌
 * @apiParam {Long} appId 站点id
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "userId": 1312370556928,
 *         "userName": "zyu",
 *         "userToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEzMTIzNzA1NTY5MjgsImlzcyI6Imh0dHA6Ly93d3cuYmx1ZXRoaW5rLmNuIiwiaWF0IjoxNTU3MjA3NzMzfQ.06gxVYjmZYW0kokU5zvs-vY7E2sTNCcFTxJNHnFhJko",
 *         "clientToken": null
 *     },
 *     "timeStamp": "2019-05-07 13:43:07"
 * }
 * @apiErrorExample {json} Error-Response:
 * {
 *     "status": 10001,
 *     "message": "令牌不合法！",
 *     "data": {
 *         "name": "INVALID_FIELD",
 *         "domainCode": null,
 *         "message": "无效字段或参数",
 *         "resource": null,
 *         "debugId": null,
 *         "details": [
 *             {
 *                 "field": "token",
 *                 "value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjc1Nzc4Mzg0NjA5MjgsImlzcyI6Imh0dHA6Ly93d3cuYmx1ZXRoaW5rLmNuIiwiaWF0IjoxNTU3MTkzMzA2fQ.f7nro3yZVjpIBDGZ54BShMsbaHgeO70PpZNDBW6Rs68",
 *                 "issue": "令牌不合法！"
 *             }
 *         ]
 *     },
 *     "timestamp": "2019-05-07 13:53:58"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {get} http://10.17.18.98:8002/gx-sso-server/auth/checkToken 04.token验证
 * @apiName checkToken
 * @apiGroup 01.服务端认证中心
 * @apiHeader {String} token 用户登录令牌
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "id": 1312370556928,
 *         "name": "zyu",
 *         "checkStatus": 2
 *     },
 *     "timeStamp": "2019-05-07 13:57:29"
 * }
 * @apiErrorExample {json} Error-Response:
 * {
 *     "status": 10001,
 *     "message": "令牌不合法！",
 *     "data": {
 *         "name": "INVALID_FIELD",
 *         "domainCode": null,
 *         "message": "无效字段或参数",
 *         "resource": null,
 *         "debugId": null,
 *         "details": [
 *             {
 *                 "field": "token",
 *                 "value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjc1Nzc4Mzg0NjA5MjgsImlzcyI6Imh0dHA6Ly93d3cuYmx1ZXRoaW5rLmNuIiwiaWF0IjoxNTU3MTkzMzA2fQ.f7nro3yZVjpIBDGZ54BShMsbaHgeO70PpZNDBW6Rs68",
 *                 "issue": "令牌不合法！"
 *             }
 *         ]
 *     },
 *     "timestamp": "2019-05-07 13:58:05"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/logout 05.注销
 * @apiName logout
 * @apiGroup 01.服务端认证中心
 * @apiHeader {String} token 用户登录令牌
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": "退出登录成功！",
 *     "timeStamp": "2019-05-07 14:43:46"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/loginExternal 06.第三方登录接口,json传参
 * @apiName loginExternal
 * @apiGroup 01.服务端认证中心
 * @apiParam {String} openId 用户唯一标识
 * @apiParam {Long} appId 站点Id
 * @apiParam {String} externalType 第三方登录方式：1/2【1.WX,微信登录，2，DD，顶顶登录方式】
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 *{
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "userId": 3796638056448,
 *         "userName": "WX_3796638056448",
 *         "userToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjM3OTY2MzgwNTY0NDgsImlzcyI6Imh0dHA6Ly93d3cuYmx1ZXRoaW5rLmNuIiwidXNlck5hbWUiOiJ2eF8zNzk2NjM4MDU2NDQ4IiwiaWF0IjoxNTYzNzY2MDU2fQ.kwG1r8Nflxz_5ChBwU2CJ2SqgLJvGlGYwEDlqx2SXp4",
 *         "clientToken": null,
 *         "userInfo": {
 *             "province": "henan"
 *         },
 *         "alias": "zyu",
 *         "avatar": "qweqweqwr"
 *     },
 *     "timeStamp": "2019-07-22 11:27:45"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/registExternal 07.第三方注册接口,json传参
 * @apiName registExternal
 * @apiGroup 01.服务端认证中心
 * @apiParam {String} openId 第三方用户登录唯一标识
 * @apiParam {Map} userInfo 其他用户信息
 * @apiParam {String} alias 用户昵称
 * @apiParam {String} avatar 用户头像
 * @apiParam {String} externalType 第三方注册方式：1/2【1.WX,微信登录，2，DD，顶顶登录方式】
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 * 	"openId":"ofrfH5YGY4ZW6Zv2D90CD6PeclNI",
 * 	"alias":"zyu",
 * 	"avatar":"qweqweqwr",
 * 	"externalType":1,
 * 	"userInfo":{
 * 		"province":"henan"
 * 	}
 * }
 * @apiVersion 0.1.0
 */


/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/phoneCode 08.获取手机验证码（form-data）
 * @apiName phoneCode
 * @apiGroup 01.服务端认证中心
 * @apiParam {Long} phone 用户手机号
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": "获取手机验证码成功",
 *     "timeStamp": "2019-10-23 09:51:03"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/verifyPhone 09.验证手机号（form-data）
 * @apiName verifyPhone
 * @apiGroup 01.服务端认证中心
 * @apiParam {Long} phone 用户手机号
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "手机号码验证成功",
 *     "data": "手机号码验证成功",
 *     "timeStamp": "2019-10-23 10:57:13"
 * }
 * @apiSuccessExample {json} Fail-Response:
 * {
 *     "status": 10001,
 *     "message": "手机号已经注册",
 *     "data": {
 *         "name": "INVALID_FIELD",
 *         "message": "无效字段或参数",
 *         "details": [
 *             {
 *                 "field": "phone",
 *                 "value": "17538139836",
 *                 "issue": "手机号已经注册"
 *             }
 *         ]
 *     },
 *     "timestamp": "2019-10-23 10:59:03"
 * }
 *
 * @apiSuccessExample {json} Fail-Response:
 * {
 *     "status": 10001,
 *     "message": "手机号码无效",
 *     "data": {
 *         "name": "INVALID_FIELD",
 *         "message": "无效字段或参数",
 *         "details": [
 *             {
 *                 "field": "phone",
 *                 "value": "175381398361",
 *                 "issue": "手机号码无效"
 *             }
 *         ]
 *     },
 *     "timestamp": "2019-10-23 10:59:22"
 * }
 *
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/resetPwd 10.找回密码（form-data）
 * @apiName resetPwd
 * @apiGroup 01.服务端认证中心
 * @apiParam {Long} phone 用户手机号
 * @apiParam {String} password 密码
 * @apiParam {String} rePassword 确认密码
 * @apiParam {String} code 手机验证码
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "密码修改成功",
 *     "data": "密码修改成功",
 *     "timeStamp": "2019-10-23 14:50:31"
 * }
 * @apiSuccessExample {json} Fail-Response:
 * {
 *     "status": 10001,
 *     "message": "验证码无效",
 *     "data": {
 *         "name": "INVALID_FIELD",
 *         "message": "无效字段或参数",
 *         "details": [
 *             {
 *                 "field": "code",
 *                 "value": "6311",
 *                 "issue": "验证码无效"
 *             }
 *         ]
 *     },
 *     "timestamp": "2019-10-23 14:46:18"
 * }
 *
 * @apiSuccessExample {json} Fail-Response:
 * {
 *     "status": 10001,
 *     "message": "手机号码无效",
 *     "data": {
 *         "name": "INVALID_FIELD",
 *         "message": "无效字段或参数",
 *         "details": [
 *             {
 *                 "field": "phone",
 *                 "value": "175381398361",
 *                 "issue": "手机号码无效"
 *             }
 *         ]
 *     },
 *     "timestamp": "2019-10-23 10:59:22"
 * }
 *
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/externalBind 11.绑定第三方账户（json传参）
 * @apiName externalBind
 * @apiGroup 01.服务端认证中心
 * @apiHeader {String} token token
 * @apiParam {String} jsCode 第三方用户登录唯一标识
 * @apiParam {Integer} externalType 第三方注册方式：1,2,3【1.WX,微信登录，2，DD，顶顶登录方式，3，WX_MP,微信网页】
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {}
 * @apiSuccessExample {json} Fail-Response:
 * {}
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/getUser 12.获取用户信息
 * @apiName getUser
 * @apiGroup 01.服务端认证中心
 * @apiHeader {String} token token
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "isRegist": true,
 *         "userId": 2443097817088,
 *         "userName": "17538139836"
 *     },
 *     "timeStamp": "2019-10-24 16:14:55"
 * }
 * @apiSuccessExample {json} Fail-Response:
 * {}
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/getExternalOpenId 13.根据jscode获取用户微信，钉钉...用户信息,json传参
 * @apiName getExternalOpenId
 * @apiGroup 01.服务端认证中心
 * @apiParam {String} jsCode 第三方用户登录唯一标识
 * @apiParam {Integer} externalType 第三方注册方式：1,2,3【1.WX,微信小程序登录，2，DD，钉钉网页登录方式，3，WX_MP，微信网页登录方式】
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "isRegist": false,
 *         "userId": null,
 *         "userName": null,
 *         "userToken": null,
 *         "clientToken": null,
 *         "userInfo": {
 *             "country": "中国",
 *             "privileges": [],
 *             "qrScene": null,
 *             "qrSceneStr": null,
 *             "subscribeTime": null,
 *             "subscribe": null,
 *             "city": "郑州",
 *             "sex": 1,
 *             "groupId": null,
 *             "tagIds": null,
 *             "language": "zh_CN",
 *             "remark": null,
 *             "province": "河南",
 *             "sexDesc": "男",
 *             "nickname": "浩～～",
 *             "subscribeScene": null
 *         },
 *         "avatar": null,
 *     },
 *     "timeStamp": "2019-09-09 15:42:03"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/phoneBind 14.绑定手机号 （form-data）
 * @apiName phoneBind
 * @apiGroup 01.服务端认证中心
 * @apiHeader {String} token token
 * @apiParam {String} phone 要绑定的用户手机号
 * @apiParam {String} code 手机验证码
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {}
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8002/gx-sso-server/auth/releaseBind 15.解除绑定第三方账户 （form-data）
 * @apiName releaseBind
 * @apiGroup 01.服务端认证中心
 * @apiHeader {String} token token
 * @apiParam {Integer} externalType 第三方方式：1,2,3【1.WX,微信登录，2，DD，顶顶登录方式，3，WX_MP,微信网页】
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {}
 * @apiVersion 0.1.0
 */




/**
 * @api {get} http://10.17.18.101:8010/datatp-server/auth/loginToken 01.站点首次登录token验证,form-data传参
 * @apiName loginToken
 * @apiGroup 02.客户端认证中心
 * @apiHeader {String} token 用户登录令牌
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "userId": 1312370556928,
 *         "userName": "zyu",
 *         "userToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEzMTIzNzA1NTY5MjgsImlzcyI6Imh0dHA6Ly93d3cuYmx1ZXRoaW5rLmNuIiwiaWF0IjoxNTU3MjA4ODI0fQ._vdDwcWh8RIDmJBhDHne186HnrYMmcb31bf32yUAbo4",
 *         "clientToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhcHAiOjIyMzY2Nzk1MDc5NjksInVpZCI6MTMxMjM3MDU1NjkyOCwiaXNzIjoiaHR0cDovL3d3dy5ibHVldGhpbmsuY24iLCJpYXQiOjE1NTcyMTExNTJ9.EWuzPUGGlypSpzvDAY38YbI_u3gINrKa9eUxx2W9yoU",
 *         "callbackUrl": "http://localhost:3000/#/index"
 *     },
 *     "timeStamp": "2019-05-07 14:39:18"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {get} http://10.17.18.101:8010/datatp-server/auth/checkToken 02.客户端token验证
 * @apiName checkToken
 * @apiGroup 02.客户端认证中心
 * @apiHeader {String} token 用户登录令牌
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "id": 1312370556928,
 *         "checkStatus": 2
 *     },
 *     "timeStamp": "2019-05-07 14:42:23"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.101:8010/datatp-server/auth/logout 03.客户端注销
 * @apiName logout
 * @apiGroup 02.客户端认证中心
 * @apiHeader {String} token 用户登录令牌
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": "退出登录成功！",
 *     "timeStamp": "2019-05-07 14:43:46"
 * }
 * @apiVersion 0.1.0
 */


/**
 * @api {post} http://10.16.28.13:8010/auth/getExternalOpenId 04.根据jscode获取用户openId,json传参
 * @apiName getExternalOpenId
 * @apiGroup 02.客户端认证中心
 * @apiParam {String} jsCode 第三方用户登录唯一标识
 * @apiParam {Integer} externalType 第三方注册方式：1,2,3【1.WX,微信登录，2，DD，顶顶登录方式，3，WX_MP,微信网页】
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 * 	"openId":"ofrfH5YGY4ZW6Zv2D90CD6PeclNI",
 * 	"alias":"zyu",
 * 	"avatar":"qweqweqwr",
 * 	"externalType":1,
 * 	"userInfo":{
 * 		"province":"henan"
 * 	}
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.16.28.7:8003/auth/register 01.注册,json传参
 * @apiName register
 * @apiGroup 03.单机认证中心
 *
 * @apiParam {String} userName 用户名，非空
 * @apiParam {String} password 用户密码，非空
 * @apiParam {String} rePassword 重复用户密码，非空
 *
 * @apiSuccess {Long} id 用户id
 * @apiSuccess {String} userName 用户名
 * @apiSuccess {String} checkStatus 用户状态
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "id": 7038443196416,
 *         "name": "zyu2",
 *         "checkStatus": 2
 *     },
 *     "timeStamp": "2019-05-07 15:02:06"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.17.18.98:8003/auth/login 02.登录,form-data传参
 * @apiName login
 * @apiGroup 03.单机认证中心
 * @apiParam {String} userName 用户id，非空
 * @apiParam {String} password 用户密码，非空
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "userId": 7038443196416,
 *         "userName": "zyu2",
 *         "userToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjcwMzg0NDMxOTY0MTYsImlzcyI6Imh0dHA6Ly93d3cuYmx1ZXRoaW5rLmNuIiwiaWF0IjoxNTU3MjEyNTYxfQ.IIQeT3wwp1v5m-RLgHLNU5rng6uox72TKGs9HSUVzi4",
 *         "clientToken": null
 *     },
 *     "timeStamp": "2019-05-07 15:02:41"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {get} http://10.17.18.98:8003/auth/checkToken 03.本地token验证
 * @apiName checkToken
 * @apiGroup 03.单机认证中心
 * @apiHeader {String} token 用户登录令牌
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "id": 7038443196416,
 *         "name": "zyu2",
 *         "checkStatus": 2
 *     },
 *     "timeStamp": "2019-05-07 15:05:44"
 * }
 * @apiVersion 0.1.0
 */


/**
 * @api {post} http://10.17.18.98:8003/auth/logout 04.注销
 * @apiName logout
 * @apiGroup 03.单机认证中心
 * @apiHeader {String} token 用户登录令牌
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": "退出登录成功！",
 *     "timeStamp": "2019-05-07 15:06:09"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.16.28.13:8003/auth/loginExternal 05.第三方登录接口,json传参
 * @apiName loginExternal
 * @apiGroup 03.单机认证中心
 * @apiParam {String} openId 用户唯一标识
 * @apiParam {String} externalType 第三方登录方式：WX/DD【1.WX,微信登录，2，DD，顶顶登录方式】
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 *{
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "userId": 3796638056448,
 *         "userName": "WX_3796638056448",
 *         "userToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjM3OTY2MzgwNTY0NDgsImlzcyI6Imh0dHA6Ly93d3cuYmx1ZXRoaW5rLmNuIiwidXNlck5hbWUiOiJ2eF8zNzk2NjM4MDU2NDQ4IiwiaWF0IjoxNTYzNzY2MDU2fQ.kwG1r8Nflxz_5ChBwU2CJ2SqgLJvGlGYwEDlqx2SXp4",
 *         "clientToken": null,
 *         "userInfo": {
 *             "province": "henan"
 *         },
 *         "alias": "zyu",
 *         "avatar": "qweqweqwr"
 *     },
 *     "timeStamp": "2019-07-22 11:27:45"
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.16.28.13:8003/auth/registExternal 06.第三方注册接口,json传参
 * @apiName registExternal
 * @apiGroup 03.单机认证中心
 * @apiParam {String} openId 第三方用户登录唯一标识
 * @apiParam {Map} userInfo 其他用户信息
 * @apiParam {String} alias 用户昵称
 * @apiParam {String} avatar 用户头像
 * @apiParam {String} externalType 第三方注册方式：WX/DD【1.WX,微信登录，2，DD，顶顶登录方式】
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 * 	"openId":"ofrfH5YGY4ZW6Zv2D90CD6PeclNI",
 * 	"alias":"zyu",
 * 	"avatar":"qweqweqwr",
 * 	"externalType":1,
 * 	"userInfo":{
 * 		"province":"henan"
 * 	}
 * }
 * @apiVersion 0.1.0
 */

/**
 * @api {post} http://10.16.28.13:8003/auth/getExternalOpenId 07.根据jscode获取用户微信，钉钉...用户信息,json传参
 * @apiName getExternalOpenId
 * @apiGroup 03.单机认证中心
 * @apiParam {String} jsCode 第三方用户登录唯一标识
 * @apiParam {Integer} externalType 第三方注册方式：WX/DD【1.WX,微信小程序登录，2，DD，钉钉网页登录方式，3，WX_MP，微信网页登录方式】
 *
 * @apiSuccess {json} result
 * @apiSuccessExample {json} Success-Response:
 * {
 *     "status": 200,
 *     "message": "成功",
 *     "data": {
 *         "isRegist": false,
 *         "userId": null,
 *         "userName": null,
 *         "userToken": null,
 *         "clientToken": null,
 *         "userInfo": {
 *             "country": "中国",
 *             "privileges": [],
 *             "qrScene": null,
 *             "qrSceneStr": null,
 *             "subscribeTime": null,
 *             "subscribe": null,
 *             "city": "郑州",
 *             "sex": 1,
 *             "groupId": null,
 *             "tagIds": null,
 *             "language": "zh_CN",
 *             "remark": null,
 *             "province": "河南",
 *             "sexDesc": "男",
 *             "nickname": "浩～～",
 *             "subscribeScene": null
 *         },
 *         "alias": "浩～～",
 *         "avatar": null,
 *     },
 *     "timeStamp": "2019-09-09 15:42:03"
 * }
 * @apiVersion 0.1.0
 */